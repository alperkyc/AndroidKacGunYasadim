package ders.alper.daycalculatorhomework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText etDay, etMonth, etYear;
    Button btnFindAge;
    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etDay = findViewById(R.id.etDay);
        etMonth = findViewById(R.id.etMonth);
        etYear = findViewById(R.id.etYear);
        btnFindAge = findViewById(R.id.btnCalculate);
        txtResult = findViewById(R.id.txtResult);


        btnFindAge.setOnClickListener(this);


    }






    @Override
    public void onClick(View v) {
        int totalDay = 0;
        Calendar cal = Calendar.getInstance();
        int nowday = cal.get(Calendar.DAY_OF_MONTH) + 2;
        int nowMonth = cal.get(Calendar.MONTH) + 1;
        int nowYear = cal.get(Calendar.YEAR);


        int bornDay = Integer.parseInt(etDay.getText().toString());
        int bornMonth = Integer.parseInt(etMonth.getText().toString());
        int bornYear = Integer.parseInt(etYear.getText().toString());





        //dogdugum yıl ve bu yıl hariç hesaplama
        for (int i = bornYear + 1; i <= nowYear - 1; i++) {
            //eğer yıl 4 e bölünürse şubat 29 çekiceğinden +1 ekledik.
            if (i % 4 == 0) {
                totalDay++;
            }

            for (int m = 1; m <= 12; m++) {
                switch (m) {
                    case 1:
                        totalDay += 31;
                        break;
                    case 2:
                        totalDay += 28;
                        break;
                    case 3:
                        totalDay += 31;
                        break;
                    case 4:
                        totalDay += 30;
                        break;
                    case 5:
                        totalDay += 31;
                        break;
                    case 6:
                        totalDay += 30;
                        break;
                    case 7:
                        totalDay += 31;
                        break;
                    case 8:
                        totalDay += 31;
                        break;
                    case 9:
                        totalDay += 30;
                        break;
                    case 10:
                        totalDay += 31;
                        break;
                    case 11:
                        totalDay += 30;
                        break;
                    case 12:
                        totalDay += 31;
                        break;


                }
            }


        }


        //dogdugum yıl gün hesaplama
        //dogdugum yıl 4 e bölünürse şubat 29'dan dolayı +1 ekledik.


        if (bornYear % 4 == 0 )  { //burdada dodugun yıl 4 e bolunurse +1 gün ekledik şubattan dolayı.İf else yapmamızın amacı 2 gün eklememesi içn
            totalDay++;
        }
        else{//burdaki amac dogduguuz günüde hesaba katmak
            totalDay++;
        }

        //eğer dogum yılı 4 e bölünüyorsa ve şubat veya önce dogduysa +1 gün eklenir şubat 29dan dolayı
        if(bornYear %4 ==0 && bornMonth<=2)
        {
            totalDay++;
        }

        for (int i = bornMonth; i <= 12; i++) {


            switch (i) {
                case 1:
                    if (i == bornMonth) {
                        totalDay += 31 - bornDay;
                    } else {
                        totalDay += 31;
                    }
                    break;
                case 2:
                    if (i == bornMonth) {
                        totalDay += 28 - bornDay;
                    } else {
                        totalDay += 28;
                    }
                    break;
                case 3:
                    if (i == bornMonth) {
                        totalDay += 31 - bornDay;
                    } else {
                        totalDay += 31;
                    }
                    break;
                case 4:if(i==bornMonth){
                    totalDay+=30-bornDay;
                }
                else{
                    totalDay+=30;
                }break;

                case 5:if(i==bornMonth){
                    totalDay+=31-bornDay;
                }
                else{
                    totalDay+=31;
                }break;

                case 6:if(i==bornMonth){
                    totalDay+=30-bornDay;
                }
                else{
                    totalDay+=30;
                }break;

                case 7:if(i==bornMonth){
                    totalDay+=31-bornDay;
                }
                else{
                    totalDay+=31;
                }break;

                case 8:if(i==bornMonth){
                    totalDay+=31-bornDay;
                }
                else{
                    totalDay+=31;
                }break;

                case 9:if(i==bornMonth){
                    totalDay+=30-bornDay;
                }
                else{
                    totalDay+=30;
                }break;

                case 10:if(i==bornMonth){
                    totalDay+=31-bornDay;
                }
                else{
                    totalDay+=31;
                }break;

                case 11:if(i==bornMonth){
                    totalDay+=30-bornDay;
                }
                else{
                    totalDay+=30;
                }break;

                case 12:if(i==bornMonth){
                    totalDay+=31-bornDay;
                }
                else{
                    totalDay+=31;
                }break;



            }

        }

        //bu yılın şuana kadar geçen günü
        //bu yıl 4 e bölünürse şubat 29 çekecegindne +1 ekledik.
        if(nowYear %4==0)
        {
            totalDay++;
        }

        for(int i=1;i<=nowMonth;i++){
            switch (i){
                case 1:if(i==nowMonth){
                    totalDay+=nowday;
                }
                else
                {
                    totalDay+=31;
                }break;
                case 2:if(i==nowMonth){
                    totalDay+=nowday;
                }
                else
                {
                    totalDay+=28;
                }break;
                case 3:if(i==nowMonth){
                    totalDay+=nowday;
                }
                else
                {
                    totalDay+=31;
                }break;
                case 4:if(i==nowMonth){
                    totalDay+=nowday;
                }
                else
                {
                    totalDay+=30;
                }break;
                case 5:if(i==nowMonth){
                    totalDay+=nowday;
                }
                else
                {
                    totalDay+=31;
                }break;
                case 6:if(i==nowMonth){
                    totalDay+=nowday;
                }
                else
                {
                    totalDay+=30;
                }break;
                case 7:if(i==nowMonth){
                    totalDay+=nowday;
                }
                else
                {
                    totalDay+=31;
                }break;
                case 8:if(i==nowMonth){
                    totalDay+=nowday;
                }
                else
                {
                    totalDay+=31;
                }break;
                case 9:if(i==nowMonth){
                    totalDay+=nowday;
                }
                else
                {
                    totalDay+=30;
                }break;
                case 10:if(i==nowMonth){
                    totalDay+=nowday;
                }
                else
                {
                    totalDay+=31;
                }break;
                case 11:if(i==nowMonth){
                    totalDay+=nowday;
                }
                else
                {
                    totalDay+=30;
                }break;
                case 12:if(i==nowMonth){
                    totalDay+=nowday;
                }
                else
                {
                    totalDay+=31;
                }break;

            }
        }

        txtResult.setText(totalDay + " Gündür Yaşıyorsunuz :)");


    }
}
