def binary_search(list, target):
    low = 0
    high = len(list) - 1

    while low <= high:
        middle = (low + high) // 2
        shot = list[middle]

        if shot == target:
            return middle
        
        elif shot > target:
            high = middle - 1

        else:
            low = middle + 1

    return None 

list = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
print(binary_search(list, 6))
