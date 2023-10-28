package com.example.zenflow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class book_main : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_main)

        val itemsList : RecyclerView = findViewById(R.id.meditation_RecycleView)
        val item123 = arrayListOf<Book>()
        val back:ImageView = findViewById(R.id.meditation_back)

        item123.add(Book("book1",
            "Что такое Ёга?",
            "Предлагаем вниманию читателя научно-популярный труд Йога Рамачараки, посвященный учению индийских йогов. Эта книга для тех кто ищет реальное Знание о реальном Мире. Рамачарака отвечает на самые сложные вопросы реинакрнации и развития Души.",
            "https://sharlib.com/read_10961-1"))

        item123.add(Book("book2",
            "Обрести себя",
            "Нам всегда чего-то не хватает: любви, внимания и ласки; денег и новой вещи; понимания близких и одобрения коллег по работе; уважения окружающих нас людей и душевного покоя. Мы ежедневно о чем-то просим Бога, Вселенную или Природу. Мы постоянно чего-то ищем и чего-то ждем.",
            "https://sharlib.com/read_656646-1"))

        item123.add(Book("book3",
            "Развиваем мышление",
            "От работы головного мозга зависит вся наша жизнь. И чем больше различных задач мы перед собой ставим, тем лучше он работает. В новой книгетренажере от автора психологических бестселлеров Виктора Шейнова вы найдете множество заданий на развитие творческого и практического мышления, сообразительности",
            "https://sharlib.com/read_583650-1"))

        item123.add(Book("book4",
            "Буддийская практика. Путь к жизни полной смысла",
            "Его Святейшество Далай Лама дает в этой книге полный обзор буддийской практики – от самых начал до наиболее утонченных техник Основываясь на фундаментальной общности всех людей нашего мира, автор адресует свою книгу не только буддистам, но и тем, кто исповедует любую другую религию",
            "https://sharlib.com/read_10957-1"))

        item123.add(Book("book5",
            "Транssерфинг. Новый взгляд",
            "Книга о том, как изменить жизнь, используя принцип зеркальности мира К нам приходит то, что мы посылаем в мир Он отражает наши мечты, намерения, сомнения, опасения Чтобы получать как можно больше позитива",
            "https://sharlib.com/read_10957-1"))

        item123.add(Book("book6",
            "Алхимия человеческого духа",
            "Под «алхимией» автор этой книги, космическая духовная сущность по имени Крайон, подразумевает Новую Энергию, приходящую в последние годы на планету Земля Это энергия, меняющая мировоззрение людей",
            "https://sharlib.com/read_10945-1"))

        item123.add(Book("book7",
            "Что есть духовная жизнь и как на нее настроиться",
            "Известная нескольким поколениям православных читателей книга « Что есть духовная жизнь и как на нее настроиться?» обращена к мирянам, ищущим спасения во Христе.",
            "https://sharlib.com/read_10960-1"))

        item123.add(Book("book8",
            "Азбука жизни. Как изменить судьбу",
            "Эта книга – руководство по созданию счастливой судьбы С ее помощью можно изменить жизнь, наполнить ее творчеством, радостью и счастьем, открыть новые пространства деятельности, реализовать свои таланты и способности",
            "https://sharlib.com/read_266540-1"))

        itemsList.layoutManager = LinearLayoutManager(this)
        itemsList.adapter = BookAdapter(item123, this)

        back.setOnClickListener {
            val intent = Intent(this, main_menu::class.java)
            startActivity(intent)
        }
    }
}