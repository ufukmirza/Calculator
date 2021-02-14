package com.example.Calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var sum:Int=0
    var holdNumber =false
    var plus =false
    var split=false
    var minus = false
    var cross =false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buttonclick(view: View) {

var pickButton = view as Button
var numbervalue : String = showNumber.text.toString()


        if(showNumber.text.toString()=="0")
            numbervalue=""
        when(pickButton.id){

            button0.id->{numbervalue+="0"}
            button1.id->{numbervalue+="1"}
            button2.id->{numbervalue+="2"}
            button3.id->{numbervalue+="3"}
            button4.id->{numbervalue+="4"}
            button5.id->{numbervalue+="5"}
            button6.id->{numbervalue+="6"}
            button7.id->{numbervalue+="7"}
            button8.id->{numbervalue+="8"}
            button9.id->{numbervalue+="9"}


            buttonartieksi.id->{




            }

            buttonplus.id->{



                if(plus==true) {

           sum = sum + numbervalue.toInt()
           numbervalue = ""

                }

                if(plus==false){

                    sum=numbervalue.toInt()
                    numbervalue=""
                    plus=true

                }


            }

            buttonminus.id->{

                if(minus==true){


                    sum = sum - numbervalue.toInt()
                    numbervalue = ""

                }


                if(minus==false){

                    if(plus==true) {
                        plus = false
                        sum=sum+numbervalue.toInt()


                    }

                    sum=numbervalue.toInt()
                    numbervalue=""
                    minus=true

                }

            }

            buttonx.id->{numbervalue+="×"}
            buttonsplit.id->{numbervalue+="÷"}
            buttonequal.id->{

                if(plus==true)
                sum=sum+numbervalue.toInt()

                if(minus==true)
                    sum=sum-numbervalue.toInt()
                plus=false
                minus=false
                cross=false
                split=false
                numbervalue=sum.toString()


            }

            buttonclear.id->{
                numbervalue="0"
                sum=0
                plus=false
                minus=false
                cross=false
                split=false
            }


        }
        showNumber.setText(numbervalue)



    }
}