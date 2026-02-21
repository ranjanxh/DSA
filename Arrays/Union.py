def findUnion(arr1,arr2,n,m):
  Union=[]
  i,j=0,0
  while i<n and j<m:
    if arr1[i]<arr2[j]:
      if not Union or Union[-1]!=arr1[i]:
        Union.append[arr1[i]]
      i+=1
    elif arr2[j]<arr1[i]:
      if not Union or Union[-1]!=arr2[j]:
        Union.append(arr2[j])
      j+=1
    else:
      if not Union or Union[-1]!=arr1[i]:
        Union.append[arr1[i]]
      i+=1
      j+=1
  while i < n:
    if not Union or Union[-1] != arr1[i]:
      Union.append(arr1[i])
    i += 1

        # Append remaining elements from arr2
  while j < m:
    if not Union or Union[-1] != arr2[j]:
      Union.append(arr2[j])
    j += 1
  return Union

