package com.example.myandroidkotlinactivity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class TaskDescriptionActivity : AppCompatActivity() {

    // 1
    companion object {
        val EXTRA_TASK_DESCRIPTION = "task"
    }

    // 2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task_description)
    }

    // 3
    fun doneClicked(view: View) {

    }
}
