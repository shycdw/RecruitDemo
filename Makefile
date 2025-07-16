.PHONY: all dev-tests
# 默认执行测试
all: dev-tests
# 单元测试，因为没有用过docker运行Android测试代码，这里只做了配置gradle执行测试任务
dev-tests:
	./gradlew testDebugUnitTest