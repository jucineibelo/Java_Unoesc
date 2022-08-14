vet1 = []
vet2 = []
vet3 = []

for i in range(10):
    vet1.append(int(input("Entre com o valor vet1[%d]: "%i)))

for i in range(10):
    vet2.append(int(input("Entre com o valor vet2[%d]: "%i)))
    
for i in range(10):
    vet3.append(vet1[i] + vet2[i])

print(vet1)
print(vet2)
print(vet3)
