### Modules in the Repository ###


* **Thread**
* Asynchronous
* database
* networking


#### Thread ####  

Thread module contains multi-threading classes and some example codes tio understand the important concepts of thread.

Classes Present :

`ExecutorTimeUtil` 

This class has a static method `getEpochMilis()` which returns the current time in epoch milis. 
Methods internally invoked - `System.currentTimeMillis()` 

To get the EpochTime in nano seconds you can use the method `System.nanoTime()` and then convert it into other common units for eg. _micro second_


