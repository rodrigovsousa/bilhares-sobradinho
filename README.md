#Comandos básicos de git

git add . # Adiciona todos os arquivos para serem commitados
git commit -m "Mensagem" # Commita os arquivos adicionados
git push origin main # Envia os arquivos para o repositório remoto
git pull origin main # Atualiza os arquivos do repositório local
git clone # Clona um repositório remoto para o repositório local
git status # Mostra o status dos arquivos
git log # Mostra o histórico de commits
git branch # Mostra as branchs
git checkout -b # Cria uma nova branch
git checkout # Alterna entre as branchs

#Comandos avançados de git
git merge # Faz o merge entre as branchs
git branch -D # Deleta uma branch
git remote add origin # Adiciona um repositório remoto
git remote -v # Mostra os repositórios remotos
git remote set-url origin # Altera o repositório remoto
git remote remove origin # Remove o repositório remoto
git config --global user.name "Nome" # Configura o nome do usuário
git config --global user.email "Email" # Configura o email do usuário
git config --global core.editor # Configura o editor de texto
git config --global -l # Mostra as configurações
git config --global -e # Edita as configurações