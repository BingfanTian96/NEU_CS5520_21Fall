package edu.neu.khoury.madsea.BingfanTian;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Task> tasks;
    private ArrayAdapter<Task> itemsAdapter;
    private ListView lvItems;

    public static final int TEXT_REQUEST = 1;
    public static final String TEXT_SEND = "extra_Task";
    // new
    private RecyclerView tasksRecyclerView;
    private Task_Adapter tasksAdapter;
    private List<Task> tasksList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tasksList = new ArrayList<>();

        tasksRecyclerView = findViewById(R.id.task_list);
        tasksRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        tasksAdapter = new Task_Adapter(this);
        tasksRecyclerView.setAdapter(tasksAdapter);

        Task task1 = new Task(1, 0, "titel1", "this is a sample task",
                0, new Date(), false, null);
        Task task2 = new Task(2, 0, "titel2", "this is a sample task",
                1, new Date(), false, null);
        tasksList.add(task1);
        tasksList.add(task2);

        tasksAdapter.setTaskList(tasksList);
    }

    public void addNewTask(View view) {
        Intent intent = new Intent(this, New_Task.class);
        startActivityForResult(intent, TEXT_REQUEST);
    }

    @Override
    public void onActivityResult(int requestCode,
                                 int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == TEXT_REQUEST) {
            if (resultCode == RESULT_OK) {
                Task reply = (Task) data.getSerializableExtra(New_Task.EXTRA_REPLY);
                tasksList.add(reply);
                tasksAdapter.setTaskList(tasksList);
            }
        }
    }

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        lvItems = (ListView) findViewById(R.id.taskList);
//        if (savedInstanceState == null) {
//            tasks = new ArrayList<Task>();
//            // add data
//            Task task1 = new Task("titel1", "this is a sample task", 0
//                    , new Date(), false, null);
//            Task task2 = new Task("titel2", "this is a sample task", 0
//                    , new Date(), false, null);
//            tasks.add(task1);
//            tasks.add(task2);
//        }
//
//        TasksAdapter adapter = new TasksAdapter(this, tasks);
//        ListView listView = (ListView) findViewById(R.id.taskList);
//        listView.setAdapter(adapter);
//
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Task curTask = tasks.get(i);
//                Intent intent = new Intent(MainActivity.this, Edit_Task.class);
//                intent.putExtra(TEXT_SEND, (Serializable) curTask);
//                startActivity(intent);
//            }
//        });
//    }
//
//    public void addNewTask(View view) {
//        Intent intent = new Intent(this, New_Task.class);
//        startActivityForResult(intent, TEXT_REQUEST);
//    }
//
//    @Override
//    public void onActivityResult(int requestCode,
//                                 int resultCode, Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//        if (requestCode == TEXT_REQUEST) {
//            if (resultCode == RESULT_OK) {
//                Task reply = (Task) data.getSerializableExtra(New_Task.EXTRA_REPLY);
//                tasks.add(reply);
//                TasksAdapter adapter = new TasksAdapter(this, tasks);
//                ListView listView = (ListView) findViewById(R.id.taskList);
//                listView.setAdapter(adapter);
//            }
//        }
//    }
//
//    @Override
//    public void onSaveInstanceState(Bundle outState) {
//        super.onSaveInstanceState(outState);
////        outState.putInt();
//    }
}