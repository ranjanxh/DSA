def secondLargest(arr):
  large=arr[0]
  slarge=0
  for i in arr:
    if i>large:
      slarge=large
      large=i
    elif i<large and i>slarge:
      slarge=i
  return slarge

arr=[10,5,8,20]
print(secondLargest(arr))