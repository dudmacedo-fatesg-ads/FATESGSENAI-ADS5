
# Este script foi criado para o ubuntu 18.04

cd ~
# Criando pastas do ambiente de desenvolvimento
echo "Criando pastas do ambiente de desenvolvimento..."
mkdir -p ~/ambiente-des/aplicativos/java
mkdir -p ~/ambiente-des/temp

# Download JDK 8
echo "Baixando JDK8..."
wget "https://bitbucket.org/dudmacedo/ambientedesenv/raw/279915a60d89130e86997f3d4cb1662a7d2addd3/utilidades/jdk8u161.tar.gz" -O ~/ambiente-des/temp/jdk-8u161-linux-x64.tar.gz
# Extrai JDK
echo "Extraindo JDK..."
tar -xzvf "ambiente-des/temp/jdk-8u161-linux-x64.tar.gz" -C "ambiente-des/aplicativos/java/" &>/dev/null
# Cria link simbólico
echo "Criando link simbólico java8..."
ln -s ~/ambiente-des/aplicativos/java/jdk1.8.0_161 ~/ambiente-des/aplicativos/java/java8

# Instalando versão do JDK
echo "Instalando versão do JDK..."
sudo update-alternatives --install /usr/bin/java java ~/ambiente-des/aplicativos/java/java8/bin/java 1
sudo update-alternatives --set java ~/ambiente-des/aplicativos/java/java8/bin/java

# Download Android Studio
echo "Baixando Android Studio..."
wget "https://dl.google.com/dl/android/studio/ide-zips/3.0.1.0/android-studio-ide-171.4443003-linux.zip" -O ~/ambiente-des/temp/android-studio-ide-171.4443003-linux.zip
# Extrai Android Studio
echo "Extraindo Android Studio..."
unzip -qq "ambiente-des/temp/android-studio-ide-171.4443003-linux.zip" -d "ambiente-des/aplicativos/"
chmod 777 -R ~/ambiente-des/aplicativos/android-studio/

DIR=`pwd`
echo "[Desktop Entry]
Version=1.0
Type=Application
Name=Android Studio
Exec=\"$DIR/ambiente-des/aplicativos/android-studio/bin/studio.sh\" %f
Icon=$DIR/ambiente-des/aplicativos/android-studio/bin/studio.png
Categories=Development;IDE;
Terminal=false
StartupNotify=true
StartupWMClass=jetbrains-android-studio
Name[en_GB]=android-studio.desktop" > $DIR/.local/share/applications/android-studio.desktop

# Executa Android Studio
~/ambiente-des/aplicativos/android-studio/bin/studio.sh
