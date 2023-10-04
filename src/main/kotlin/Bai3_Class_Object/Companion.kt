package Bai3_Class_Object

class PhysicsSystem {
    companion object WorldConstants {
        val gravity = 9.8
        val unit = "metric"
        fun computeForce(mass: Double, accel: Double): Double {
            return mass * accel
        }
    }
}

fun main() {
    println(PhysicsSystem.WorldConstants.gravity)
    println(PhysicsSystem.WorldConstants.computeForce(10.0, 10.0))
}
// Đối tương companion
// Cho phép mọi thực thể của một lớp dùng chung một thực thể của tập hợp các biến hoặc hàm
// Dùng từ khóa companion
// Được tham chiếu qua Classname.PropertyFunction