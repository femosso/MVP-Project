# MVP-Project

Self-study repository to understand Android MVP architecture.

![alt text](https://raw.githubusercontent.com/femosso/MVP-Project/master/MVP.png)

**Model:** manipulates all logic related to the data of the application. The content is download from an own-created dataset hosted in: https://raw.githubusercontent.com/femosso/products-dataset/master/data.txt.
The data is downloaded with Retrofit library and inflated to the View through the Presenter.

**View:** receives commands from the presenter and display them them accordingly to its own logic. It won't take any action by itselft. Instead, it will be fully controlled by the Presenter layer.
In order to make this communication happen, it should implement methods defined in a Contract between View and Presenter layers.

**Presenter:** interfaces between View and Model layers. It is responsible from implementing user actions defined in the Contract between View and Presenter.
It does not (and should not) contain any Android classes or too much logic in it.
