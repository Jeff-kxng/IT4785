package Bai2_Ham

// Nếu không chỉ định giá trị mặc định cho tham số, bạn sẽ phải cung cấp đối số tương ứng
// {day : String, temp : Int} là tham số bbắt buộc
fun temptoday(day : String, temp : Int){
    println("Today is $day and it is $temp degrees!")
}

fun main(args: Array<String>) {
    val dayOfWeek = "Tuesday"
    val temperature = 25

    temptoday(dayOfWeek, temperature)
}