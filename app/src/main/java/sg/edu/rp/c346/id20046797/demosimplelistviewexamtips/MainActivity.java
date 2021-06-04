package sg.edu.rp.c346.id20046797.demosimplelistviewexamtips;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvExamTips;
    String[] examTipArray;
    ArrayList<String> examTipArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvExamTips = findViewById(R.id.listViewExamTips);

//        examTipArray = new String[5];
//        examTipArray[0] = "Don't just read the code, code it as much as possible during each practical session ";
//        examTipArray[1] = "Seek help from the lecturer ASAP, don't wait till you lost in the jungle";
//        examTipArray[2] = "Prepare your template source code for each topic ";
//        examTipArray[3] = "Create a few empty Android projects to speed up your coding during the exam ";
//        examTipArray[4] = "Ensure that your Android Studio is up and running before the exam";
//        ArrayAdapter adapter = new ArrayAdapter<> (this, android.R.layout.simple_list_item_1, examTipArray);

        examTipArrayList.add("Don't just read the code, code it as much as possible during each practical session ");
        examTipArrayList.add("Seek help from the lecturer ASAP, don't wait till you lost in the jungle");
        examTipArrayList.add("Prepare your template source code for each topic");
        examTipArrayList.add("Create a few empty Android projects to speed up your coding during the exam ");
        examTipArrayList.add("Ensure that your Android Studio is up and running before the exam");

        ArrayAdapter adapter = new ArrayAdapter<> (this, android.R.layout.simple_list_item_1, examTipArrayList);

        lvExamTips.setAdapter(adapter);
    }
}