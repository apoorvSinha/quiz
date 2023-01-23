package com.example.quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView

class QuizQuestionsActivity : AppCompatActivity() {

    private var progressBar: ProgressBar? = null
    private var tvProgressBar: TextView? = null
    private var tvQuestion: TextView? = null
    private var ivImage: ImageView? =null
    private var tvOptionOne: TextView? =null
    private var tvOptionTwo: TextView? =null
    private var tvOptionThree: TextView? =null
    private var tvOptionFour: TextView? =null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)
        val questionList = Constants.getQuestions()
        progressBar = findViewById(R.id.progressBar)
        tvProgressBar = findViewById(R.id.tvProgress)
        tvQuestion = findViewById(R.id.tvQuestion)
        ivImage = findViewById(R.id.ivImage)
        tvOptionOne = findViewById(R.id.tv_option_one)
        tvOptionTwo = findViewById(R.id.tv_option_two)
        tvOptionThree = findViewById(R.id.tv_option_Three)
        tvOptionFour = findViewById(R.id.tv_option_four)

        Log.i("Question list size is", " ${questionList.size}")

        for(i in questionList){
            Log.e("Questions", i.question)

        }
        var currentPosition = 1
        val question : Question = questionList[currentPosition-1]
        ivImage?.setImageResource(question.image)
        progressBar?.progress = currentPosition
        tvProgressBar?.text = "$currentPosition / ${progressBar?.max}"
        tvQuestion?.text = question.question
        tvOptionOne?.text = question.optionOne
        tvOptionTwo?.text = question.optionTwo
        tvOptionThree?.text = question.optionThree
        tvOptionFour?.text = question.optionFour


    }

}