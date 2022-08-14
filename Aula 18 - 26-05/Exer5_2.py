vet = []

for i in range(10):
    vet.append(int(input("Entre com o valor vet[%d]: "%i)))

num = int(input("Entre com um número a ser encontrado: "))
vezes = 0
for i in range(10):
    if (vet[i] == num):
        vezes = vezes + 1
print("O número",num,"foi encontrado",vezes,"vezes.")
print("O número %d foi encontrado %d vezes."%(num,vezes))
