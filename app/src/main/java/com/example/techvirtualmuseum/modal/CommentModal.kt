package com.example.techvirtualmuseum.modal

import java.sql.Timestamp

class commentModal {
    // getter and setter methods variables for storing our image and name.
    var author: String? = null
    var comment: String? = null

    constructor() {
        // empty constructor required for firebase.
    }

    // constructor for our object class.
    constructor(author: String?, comment: String?) {
        this.author = author
        this.comment = comment
    }

}