package com.example.mob.data

import com.example.mob.R
import com.example.mob.presentation.model.Course

object CourseData {

    val courses = listOf(
        Course(
            0,
            "Ia aplicada na educação",
            "Um curso que explora os impactos da Inteligência Artificial na nova era da educação",
                    image = R.drawable.aicourseimg
        ),

        Course(
            1,
            "Oficina de Modelagem 3D",
            "Aprenda a criar projetos 3D do zero de forma intuitiva",
            image = R.drawable.picture3d
        ),

        Course(
            2,
            "Curso de Inglês Acadêmico",
            "Aprenda o inglês essencial para artigos acadêmicos",
            image = R.drawable.englishpic
        )
    )

}