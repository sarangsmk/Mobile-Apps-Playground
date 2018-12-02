public class DatePickerWidgetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.datepicker);

        DatePicker dp = findViewById(R.id.datePicker);
        dp.setOnDateChangedListener(dateChangedListener);
    }
    private DatePicker.OnDateChangedListener dateChangedListener =
            new DatePicker.OnDateChangedListener(){
        @Override
        public void onDateChanged(DatePicker datePicker, int i, int i1, int i2) {
            Toast.makeText(DatePickerWidgetActivity.this, "picked date is " + datePicker.getDayOfMonth() +
                    " / " + (datePicker.getMonth()+1) +
                    " / " + datePicker.getYear(), Toast.LENGTH_SHORT).show();
        }
    };

}
