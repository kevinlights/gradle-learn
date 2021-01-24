# gradle plugins learn



Learn how to develop gradle plugin.



two different ways to create gradle plugins.

1. embed way: new plugin in `build.gradle` file
2. singleton way: new groovy file to implement logic.



note:

1. you can publish the plugin jar by `maven-puglish` plugin
2. then publish plugin to local or other repository.
3. use the plugin in `buildScript` closure 
4. apply the plugin