var nums;
nums = [33, 37, 200, 10, 91, 7, 123, 4, 6, 5];
var minumumNum = function (numArr) {
    var minNum = 0;
    for (var i = 0; i < numArr.length; i++) {
        for (var j = i + 1; j < numArr.length; j++) {
            if (numArr[i] < numArr[j]) {
                minNum = numArr[i];
            }
            else if (numArr[i] > numArr[j]) {
                minNum = numArr[j];
            }
        }
    }
    return minNum;
};
console.log(minumumNum(nums));
