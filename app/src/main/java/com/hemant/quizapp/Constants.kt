package com.hemant.quizapp

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions():ArrayList<Questions>{
        val questionsList = ArrayList<Questions>()

        val que1 = Questions(
            1, "What country does this flag belong to?",
            R.drawable.flag_argentina,
            "Argentina", "Australia", "Armenia", "Austria",
            1
        )

        questionsList.add(que1)

        val que2 = Questions(
            2, "What country does this flag belong to?",
            R.drawable.flag_moldova,
            "Libya", "Lithuania", "Madagascar", "Moldova",
            4
        )

        questionsList.add(que2)

        val que3 = Questions(
            3, "What country does this flag belong to?",
            R.drawable.flag_brazil,
            "Jordan", "Brazil", "Kuwait", "Cambodia",
            2
        )

        questionsList.add(que3)

        val que4 = Questions(
            4, "What country does this flag belong to?",
            R.drawable.flag_japan,
            "Japan", "China", "Canada", "Burkina",
            1
        )

        questionsList.add(que4)

        val que5 = Questions(
            5, "What country does this flag belong to?",
            R.drawable.flag_bangladesh,
            "Cameroo", "Uganda", "Bangladesh", "Uzbekistan",
            3
        )

        questionsList.add(que5)



        return questionsList
    }
}