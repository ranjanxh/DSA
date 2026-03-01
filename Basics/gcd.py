class Solution:
    def gcd(self, a, b):
        # code here
        while a!=0:
            b,a=a,b%a
        return b
        