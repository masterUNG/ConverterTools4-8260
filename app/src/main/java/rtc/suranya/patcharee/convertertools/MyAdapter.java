package rtc.suranya.patcharee.convertertools;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by masterUNG on 12/4/2016 AD.
 */

public class MyAdapter extends BaseAdapter{

    private Context context;
    private double[] doubles;
    private String[] strings;
    private TextView valueTextView, unitTextView;

    public MyAdapter(Context context,
                     double[] doubles,
                     String[] strings) {
        this.context = context;
        this.doubles = doubles;
        this.strings = strings;
    }

    @Override
    public int getCount() {
        return doubles.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view1 = layoutInflater.inflate(R.layout.my_listview, viewGroup, false);

        valueTextView = (TextView) view1.findViewById(R.id.textView);
        unitTextView = (TextView) view1.findViewById(R.id.textView3);

        unitTextView.setText(strings[i]);
        valueTextView.setText(Double.toString(doubles[i]));

        return view1;
    }
}   // Main Class
