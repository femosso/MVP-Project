# MVP-Project

Self-study repository to understand MVP architecture in Android applications.

![alt text](https://raw.githubusercontent.com/femosso/MVP-Project/master/MVP.png)

**Model:** manipulates all the logic related to the data of the application. The content is downloaded from an own-created dataset hosted in: https://raw.githubusercontent.com/femosso/products-dataset/master/data.txt. The data is downloaded with Retrofit library and inflated in the View through the Presenter layer.

**View:** receives commands from the presenter and display them accordingly to its own logic. It won't take any action by itself. Every user action capture by a View is delegated and controlled by the Presenter layer. In order to make this communication happen, the View should implement the methods defined in a Contract between View and Presenter layers.

**Presenter:** interfaces between View and Model layers. It is responsible from implementing the user actions defined in the Contract defined between View and Presenter. It does not (and should not) contain any Android classes or too much logic in it.
