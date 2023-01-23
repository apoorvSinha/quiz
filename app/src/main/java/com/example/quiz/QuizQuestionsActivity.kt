package com.example.quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView

class QuizQuestionsActivity : AppCompatActivity() {
    var num : Int = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)
        val questionList = Constants.getQuestions()

        Log.i("Question list size is"," ${questionList.size}")
    }

    fun getQuestion(num: Int, questions: ArrayList<Question>) : Question{
        return questions[num]
    }

    fun changeFlag(questionNumber: Int){
        var getFlag: ImageView = findViewById(R.id.flag_used)
        getFlag.background = getQuestion(num, questionList).image
    }
}