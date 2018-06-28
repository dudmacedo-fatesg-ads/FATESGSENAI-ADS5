For more details, visitAnimated-Expanding-ListView
===========================

[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-Animated--Expanding--ListView-green.svg?style=true)](https://android-arsenal.com/details/1/2778)

Developed by <a href='https://github.com/LeonardoCardoso' target='_blank'>@LeonardoCardoso</a>. 

Animated Expanding ListView provides a fancy animation on expanding or collapsing the content of a listview item.

It works in all version of Android and it's very easy to adapt to your project.

## How to use with Gradle

Simply add the repository to your build.gradle file:
```groovy
repositories {
	jcenter()
	maven { url 'https://github.com/leonardocardoso/mvn-repo/raw/master/maven-deploy' }
}
```

And you can use the artifacts like this:
```groovy
dependencies {
	compile 'com.leocardz:aelv:1.1@aar'
	// ...
}
```


## Important
<ul>
    <li> Your list adapter must extend <b>ArrayAdapter&lt;? yourListItem ?&gt;</b> </li>
    <li> Your listview item must extend from AelvListItem
        <ul>
            <li> Right after you create your listview item, you need to call <b>yourItem.setUp(int collapsedHeight, int expandedHeight, boolean isOpen);</b> to setup the dimensions.</li>
        </ul>
    </li>
    <li> Your listview item view holder must extend from AelvListViewHolder
        <ul>
            <li> Right after you instantiate your view holder you need to call <b>yourHolder.setViewWrap(viewWrap)</b>; and tell adapter that you are updating the item size calling <b>holder.getViewWrap().setLayoutParams(new AbsListView.LayoutParams(AbsListView.LayoutParams.MATCH_PARENT, listItem.getCurrentHeight()));</b>.</li>
            <li> Right before you return the view on your custom adapter, you must call <b>yourItem.setHolder(yourHolder)</b>;</li>
        </ul>
    </li>
    <li>You need to instantiate <b>Aelv aelv = new Aelv(isAccordion, animationDuration, yourListItems, yourListView, yourAdapter);</b> right after you setup your listview.</li>
    <li>Last thing: your must implement <b>listview.setOnItemClickListener();</b> and insert this <b>aelv.toggle(view, position);</b> inside the listener and voilà!</li>
</ul>

Just check the app example to see it clearly.


| Normal | Accordion |
:--:|:--:
|![Normal](http://i.imgur.com/j8KK5yh.gif) | ![Accordion](http://i.imgur.com/rVmezyp.gif) |


Contact
=================================

Contact me either by Twitter [@leocardz](https://twitter.com/leocardz) or emailing me to [contact@leocardz.com](mailto:contact@leocardz.com).


License
=================================

    Copyright 2014 Leonardo Cardoso

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
