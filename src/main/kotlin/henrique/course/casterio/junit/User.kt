package henrique.course.casterio.junit

data class User(
    val firstName: String,
    val lastName: String,
    val age: Int,
    val postalAddress: List<String>
) {
    fun isAdult() = age >= 18
    fun canReceiveMail() = postalAddress.isNotEmpty()
}