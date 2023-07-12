function findSmallest(arr) {
    let small = arr[0];
    let small_index = 0;

    for (let i = 1; i < arr.length; i++) {
        if (arr[i] < small) {
            small = arr[i];
            small_index = i;
        }
    }

    return small_index;
}

function selectionSort(arr) {
    let newArr = [];

    while (arr.length > 0) {
        let small = findSmallest(arr);
        newArr.push(arr.splice(small, 1)[0]);
    }

    return newArr;
}

console.log(selectionSort([5, 3, 6, 2, 10]));
