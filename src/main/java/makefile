# Компилятор и флаги
JC = javac
JFLAGS = -encoding UTF-8
JVM = java
JVMFLAGS = -Dfile.encoding=UTF-8

# Путь к исходникам
SRC_DIR = org/example

# Цели по умолчанию
all: compile

# Компиляция всех .java файлов
compile:
	@echo "🛠  Компилирую Java файлы..."
	$(JC) $(JFLAGS) $(SRC_DIR)/*.java
	@echo "✅ Компиляция завершена!"

# Запуск основной программы
run: compile
	@echo "🚀 Запускаю программу..."
	@echo "=========================="
	$(JVM) $(JVMFLAGS) -cp . org.example.Main

# Тесты
test: compile
	@echo "🧪 Запускаю тесты..."
	$(JVM) $(JVMFLAGS) -cp . org.example.Test

test-decrypt: compile
	@echo "🔓 Тест расшифровки..."
	$(JVM) $(JVMFLAGS) -cp . TestDecrypt

# Очистка
clean:
	@echo "🧹 Удаляю .class файлы..."
	rm -f $(SRC_DIR)/*.class
	@echo "✅ Очистка завершена!"

.PHONY: all compile run test test-decrypt clean