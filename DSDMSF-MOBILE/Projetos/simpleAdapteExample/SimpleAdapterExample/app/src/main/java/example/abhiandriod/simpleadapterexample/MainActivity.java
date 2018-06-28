package example.abhiandriod.simpleadapterexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    //initialize view's
    ListView simpleListView;

    String[] animalName={"Lion","Tiger","Monkey","Dog","Cat","Elephant"};//animal names array
    int[] animalImages={R.drawable.lion,R.drawable.tiger,R.drawable.monkey,R.drawable.dog,R.drawable.cat,R.drawable.elephant};//animal images array

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        simpleListView=(ListView)findViewById(R.id.simpleListView);

        ArrayList<HashMap<String,String>> arrayList=new ArrayList<HashMap<String,String>>();
        for (int i=0;i<animalName.length;i++)
        {
            HashMap<String,String> hashMap=new HashMap<>();//create a hashmap to store the data in key value pair
            hashMap.put("name",animalName[i]);
            hashMap.put("image",animalImages[i]+"");
            arrayList.add(hashMap);//add the hashmap into arrayList
        }


        /*Map<String,Integer> alunos = new HashMap<String,Integer>();

        alunos.put("vinicius",23);
        alunos.put("douglas",24);
        alunos.put("samuel",22);
        alunos.put("poliana",15);


        if(alunos.containsKey("alunos")){
            System.out.println(alunos.get("poliana"));
        }*/


        String[] from={"name","image"};//string array
        int[] to={R.id.textoItem,R.id.imagemItem};//int array of views id's


        SimpleAdapter simpleAdapter=new SimpleAdapter(
                this,arrayList,R.layout.list_view_items,
                from,to);//Create object and set the parameters for simpleAdapter

        simpleListView.setAdapter(simpleAdapter);//sets the adapter for listView

        //perform listView item click event
        simpleListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),animalName[i],Toast.LENGTH_LONG).show();//show the selected image in toast according to position
            }
        });
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MainActivity that = (MainActivity) o;

        if (simpleListView != null ? !simpleListView.equals(that.simpleListView) : that.simpleListView != null)
            return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        if (!Arrays.equals(animalName, that.animalName)) return false;
        return Arrays.equals(animalImages, that.animalImages);

    }

    @Override
    public int hashCode() {
        int result = simpleListView != null ? simpleListView.hashCode() : 0;
        result = 31 * result + Arrays.hashCode(animalName);
        result = 31 * result + Arrays.hashCode(animalImages);
        return result;
    }
}
