package com.ciandt.brewerybees.data.model

data class Top10(
    val brewerynametop10: String,
    val breweryratingtop10: String,
    val brewerytypetop10: String,
    val brewerylocationtop10: String,
    val brewerystartop10: Boolean
)

class Top10Builder{
    var brewerynametop10: String = ""
    var breweryratingtop10: String = ""
    var brewerytypetop10: String = ""
    var brewerylocationtop10: String = ""
    var brewerystartop10: Boolean = false

    fun build() : Top10 = Top10(brewerynametop10, breweryratingtop10, brewerytypetop10, brewerylocationtop10, false)
}

fun top10(block: Top10Builder.() -> Unit): Top10 = Top10Builder().apply(block).build()

fun faketop10() : MutableList<Top10> = mutableListOf(
    top10 {
        brewerynametop10 = "Bar do Jon"
        breweryratingtop10 = "5,0"
        brewerytypetop10 = "Tipo"
        brewerylocationtop10 = "2,9km"
        brewerystartop10 = false
    },
    top10 {
        brewerynametop10 = "Bar da Dalva"
        breweryratingtop10 = "5,0"
        brewerytypetop10 = "Tipo"
        brewerylocationtop10 = "2,4km"
        brewerystartop10 = false
    },
    top10 {
        brewerynametop10 = "Botequin Lirio"
        breweryratingtop10 = "4,9"
        brewerytypetop10 = "Tipo"
        brewerylocationtop10 = "1,9km"
        brewerystartop10 = false
    },
    top10 {
        brewerynametop10 = "Bar do Neto"
        breweryratingtop10 = "4,8"
        brewerytypetop10 = "Tipo"
        brewerylocationtop10 = "2,6km"
        brewerystartop10 = false
    },
    top10 {
        brewerynametop10 = "Taverna Targaryen"
        breweryratingtop10 = "4,8"
        brewerytypetop10 = "Tipo"
        brewerylocationtop10 = "2,0km"
        brewerystartop10 = false
    },
    top10 {
        brewerynametop10 = "Bar da Lu"
        breweryratingtop10 = "4,6"
        brewerytypetop10 = "Tipo"
        brewerylocationtop10 = "2,7km"
        brewerystartop10 = false
    },
    top10 {
        brewerynametop10 = "A Tenda"
        breweryratingtop10 = "4,4"
        brewerytypetop10 = "Tipo"
        brewerylocationtop10 = "0,4"
        brewerystartop10 = false
    },
    top10 {
        brewerynametop10 = "Bar do Douglas"
        breweryratingtop10 = "4,1"
        brewerytypetop10 = "Tipo"
        brewerylocationtop10 = "4,4km"
        brewerystartop10 = false
    },
    top10 {
        brewerynametop10 = "Fonte do Sabor"
        breweryratingtop10 = "4,0"
        brewerytypetop10 = "Tipo"
        brewerylocationtop10 = "3,5km"
        brewerystartop10 = false
    },
    top10 {
        brewerynametop10 = "Bar da Ines"
        breweryratingtop10 = "3,9"
        brewerytypetop10 = "Tipo"
        brewerylocationtop10 = "2,5km"
        brewerystartop10 = false
    }

)