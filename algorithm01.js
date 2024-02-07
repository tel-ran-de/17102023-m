function linerSearch() {
  let arr = [1, 2, 3, 5, 10];
  console.log('2 - ${getNumber(arr, 2)} index');
}

function getNumber(arr, num) {
  for(let i = 0; i < arr.length; i++) {
    if (arr[i] == num) {
      return i;
    }
  }
  return -1;
}