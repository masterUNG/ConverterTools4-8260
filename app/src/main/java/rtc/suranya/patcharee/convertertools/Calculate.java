package rtc.suranya.patcharee.convertertools;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import rtc.surunya.patcharee.convertertools.R;

public class Calculate extends AppCompatActivity implements View.OnClickListener {


    // Explicit
    private TextView textView;
    private EditText editText;
    private Spinner spinner;
    private Button button;
    private ListView listView;
    private int indexAnInt, indexSpinnerChoseAnInt;
    private String[] titleStrings, lengthStrings, tempStrings, areaStrings,
            volumeStrings, weightStrings, timeStrings, spinnerStrings;
    private MyConstant myConstant;
    private double rowMatADouble, baseADouble; // สิ่งที่รับจาก Edit  abc text
    private String unitString;
    private double[] factorDoubles, valueDoubles;
    private int tempAnInt = 0;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);

        myConstant = new MyConstant();
        titleStrings = myConstant.getTitleStrings();

        //bind widget
        textView = (TextView) findViewById(R.id.textView2);
        editText = (EditText) findViewById(R.id.editText);
        spinner = (Spinner) findViewById(R.id.spinner);
        button = (Button) findViewById(R.id.button);
        listView = (ListView) findViewById(R.id.livAnswer);

        // get value from intent
        indexAnInt = getIntent().getIntExtra("Index", 0);


        textView.setText(titleStrings[indexAnInt]);

        //show spinner


        //การกำหนดค่า Array ใหั Spinner , Factor
        switch (indexAnInt) {
            case 0:
                spinnerStrings = myConstant.getLengthStrings();
                factorDoubles = myConstant.getLengthDoubles();
                break;
            case 1:
                spinnerStrings = myConstant.getTempStrings();
                //factorDoubles = myConstant.getTempDoubles();    // แก้ไข สูตร C/100 = (F-32)/180
                factorDoubles = myTempCalculate();
                break;
            case 2:
                spinnerStrings = myConstant.getAreaStrings();
                factorDoubles = myConstant.getAreaDoubles();
                break;
            case 3:
                spinnerStrings = myConstant.getVolumeStrings();
                factorDoubles = myConstant.getVolumeDoubles();
                break;
            case 4:
                spinnerStrings = myConstant.getWeightStrings();
                factorDoubles = myConstant.getWeightDoubles();
                break;
            case 5:
                spinnerStrings = myConstant.getTimeStrings();
                factorDoubles = myConstant.getTimeDoubles();
                break;


        }   //switch

        //About Spinner
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(Calculate.this,
                android.R.layout.simple_list_item_1, spinnerStrings);
        spinner.setAdapter(stringArrayAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                unitString = spinnerStrings[i];
                indexSpinnerChoseAnInt = i;
                setIndexSpinnerChoseAnInt(i);
                tempAnInt = i;

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

                unitString = spinnerStrings[0];
                indexSpinnerChoseAnInt = 0;
                setIndexSpinnerChoseAnInt(0);


            }
        });


        //Button Controller
        button.setOnClickListener(this);





    }   // main method

    public void setIndexSpinnerChoseAnInt(int indexSpinnerChoseAnInt) {
        this.indexSpinnerChoseAnInt = indexSpinnerChoseAnInt;
        Log.d("4decV1", "from setter indexSpinner ==> " + indexSpinnerChoseAnInt);
    }

    private double[] myTempCalculate() {

        double[] result = new double[2];

        try {

            Log.d("4decV1", "tempAnInt ==> " + tempAnInt);
            switch (tempAnInt) {
                case 0:
                    result[0] = 1;
                    result[1] = ((9 / 5) * Double.parseDouble(editText.getText().toString())) + 32;
                    break;
                case 1:
                    result[0] = (Double.parseDouble(editText.getText().toString()) - 32) * (5 / 9);
                    result[1] = 1;
                    break;
            }


        } catch (Exception e) {
            result = myConstant.getTempDoubles();
        }

        return result;

    }

    @Override
    public void onClick(View view) {

        String s = null;
        s = editText.getText().toString().trim();

        if (s.equals("")) {
            Toast.makeText(Calculate.this, "Please Fill in Blank", Toast.LENGTH_SHORT).show();
        } else {
            //No Space

            rowMatADouble = Double.parseDouble(s);
            Log.d("4decV1", "rowMat ==> " + rowMatADouble + " " + unitString);
            Log.d("4decV1", "tempAnint เมื่อคลิก ==> " + tempAnInt);


            //Create Spinner
            if (indexAnInt == 1) {
                //Temp
                valueDoubles = new double[2];

                switch (tempAnInt) {
                    case 0:
                        valueDoubles[0] =  rowMatADouble;
                        valueDoubles[1] = ((1.8) * rowMatADouble) + 32;
                        break;
                    case 1:
                        valueDoubles[0] = (rowMatADouble - 32) * 5.0 / 9.0;
                        valueDoubles[1] = rowMatADouble;
                        break;
                }


            } else {

                baseADouble = rowMatADouble / factorDoubles[indexSpinnerChoseAnInt];

                Log.d("4decV1", "base ==> " + baseADouble);

                valueDoubles = new double[factorDoubles.length];
                for (int i=0;i<factorDoubles.length;i++) {
                    valueDoubles[i] = factorDoubles[i] * baseADouble;
                }
            }

            MyAdapter myAdapter = new MyAdapter(Calculate.this, valueDoubles, spinnerStrings);
            listView.setAdapter(myAdapter);


        }   // if



    }   // onClick

}   // main class
