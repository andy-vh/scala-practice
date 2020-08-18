def shuffle(nums: Array[Int], n: Int): Array[Int] = {
  var ret = new Array[Int](2*n)
  for (i <- 0 until n) {
    // index for input array
    var i_x = i
    var i_y = n + i

    // index for output array
    var j_x = 2*i
    var j_y = 2*i + 1

    ret(j_x) = nums(i_x)
    ret(j_y) = nums(i_y)
  }
  ret
}

var test_input_array = Array(2, 5, 1, 3, 4, 7)
var test_input_int = 3

var output = shuffle(test_input_array, test_input_int)