package pl.edu.ug.aib.firstApp.itemView;

import android.content.Context;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.androidannotations.annotations.EViewGroup;
import org.androidannotations.annotations.ViewById;

import pl.edu.ug.aib.firstApp.R;
import pl.edu.ug.aib.firstApp.data.Person;

/**
 * Created by student7 on 2014-12-04.
 */


@EViewGroup(R.layout.list_item_view)
public class PersonItemView extends RelativeLayout {
    @ViewById
    TextView acronym;

    @ViewById
    TextView name;

    @ViewById
   TextView company;


    public PersonItemView(Context context) {
        super(context);
    }

    public void bind(Person person)
    {
        name.setText(person.name);
        company.setText(person.company);

    }

}
