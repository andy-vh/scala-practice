def runningSum(nums: Array[Int]): Array[Int] = {
  var ret = new Array[Int](nums.length)
  ret(0) = nums(0)

  for (i <- 1 until nums.length) {
    ret(i) = ret(i-1) + nums(i)
  }

  ret
}

var test_input = Array(1, 2, 3, 4, 5)
var output = runningSum(test_input)