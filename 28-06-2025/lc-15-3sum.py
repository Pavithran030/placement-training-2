class Solution(object):
    def threeSum(self, nums):
        nums.sort()
        n=len(nums)
        fin=[]

        for i in range(n):
            if nums[i]>0:
                break
            elif i>0 and nums[i]==nums[i-1]:
                continue

            lo,hi=i+1,n-1
            while lo<hi:
                su=nums[i]+nums[lo]+nums[hi]
                if su==0:
                    fin.append([nums[i],nums[lo],nums[hi]])
                    lo+=1
                    hi-=1
                    while lo<hi and nums[lo]==nums[lo-1]:
                        lo+=1
                    while lo<hi and nums[hi]==nums[hi-1]:
                        hi-=1 
                elif su<0:
                    lo+=1
                    
                else:
                    hi-=1
        return fin
    
