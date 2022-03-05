package com.group3.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class CalculationActivity : AppCompatActivity() {
    private var canAddOperation = false
    private var canAddDecimal = true
    private lateinit var workingsTV: TextView
    private lateinit var resultsTV: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculation)
        workingsTV = findViewById(R.id.workingsTV)
        resultsTV = findViewById(R.id.resultsTV)
    }

    fun numberAction(view: View) {
        if (view is Button) {
            if (view.text == ".") {
                if (canAddDecimal)
                    workingsTV.append(view.text)

                canAddDecimal = false
            } else
                workingsTV.append(view.text)

            canAddOperation = true
        }
    }

    fun operationAction(view: View) {
        if (view is Button && canAddOperation) {
            workingsTV.append(view.text)
            canAddOperation = false
            canAddDecimal = true
        }
    }

    fun allClearAction(view: View) {
        workingsTV.text = ""
        resultsTV.text = ""
    }

    fun backSpaceAction(view: View) {
        val length = workingsTV.length()
        if (length > 0)
            workingsTV.text = workingsTV.text.subSequence(0, length - 1)
    }

    fun equalsAction(view: View) {
        resultsTV.text = calculateResults()
    }

    private fun calculateResults(): String {
        //dikerjakan di branch feature/calculate_results

        val result = "result"
        return result.toString()
    }

    private fun addSubtractCalculate(){
        //dikerjakan di branch feature/add_subtract_calculate

    }

    private fun timesDivisionCalculate(passedList: MutableList<Any>): MutableList<Any> {
        var list = passedList
        while (list.contains('x') || list.contains('/')) {
            list = calcTimesDiv(list)
        }
        return list
    }

    private fun calcTimesDiv(){
        //dikerjakan di branch feature/calc_times_div

    }

    private fun digitsOperators(){
        //dikerjakan di branch feature/digits_operators

    }
}