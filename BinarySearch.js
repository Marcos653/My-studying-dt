function binarySearch(list, target) {
    let low = 0
    let high = list.length - 1

    while (low <= high) {
        let middle = Math.floor((low + high) / 2) 
        let shot = list[middle]

        if (shot == target) {
            return middle
        }

        else if (shot > target) {
            high = middle - 1
        }

        else {
            low = middle + 1
        }
    }

    return null
}

let list = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
console.log(binarySearch(list, 6))
