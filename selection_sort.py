def findSmallest(arr):
    small = arr[0]
    small_index = 0

    for i in range(1, len(arr)):
        if arr[i] < small:
            small = arr[i]
            small_index = i

    return small_index

def selectionSort(arr):
    newArr = []

    for i in range(len(arr)):
        small = findSmallest(arr)
        newArr.append(arr.pop(small))

    return newArr

print(selectionSort([5, 3, 6, 2, 10]))