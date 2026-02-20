def largest(arr):
  large=arr[0]
  for i in arr:
    if i>large:
      large=i
  return large

arr=[10,5,20,8]
print(largest(arr))
