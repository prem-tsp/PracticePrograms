inp = input()
sum = 0
for i in inp:
	if(inp.count(i)>sum):
		sum = inp.count(i)
		ans = i
print(ans)
