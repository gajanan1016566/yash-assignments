var nums;
nums = [14, 34, 104, 14, 44];
var calAvg = function (numArr) {
    var totalNum = numArr.length;
    var sumOfNumbers = 0;
    numArr.forEach(function (element) {
        sumOfNumbers += element;
    });
    if (totalNum > 0) {
        return sumOfNumbers / totalNum;
    }
    else {
        console.log("Array is empty !!");
    }
    return 0;
};
console.log(calAvg(nums));
