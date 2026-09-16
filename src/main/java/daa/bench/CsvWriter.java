package daa.bench;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class CsvWriter {

    public static void write(Path outputPath, List<Result> results) throws IOException {
        try (BufferedWriter writer = Files.newBufferedWriter(outputPath)) {
            writer.write("algorithm,input,n,time_ms,comparisons,max_depth");
            writer.newLine();

            for (Result result : results) {
                writer.write(result.toCsvRow());
                writer.newLine();
            }
        }
    }
}
             .-------------------------:                   nursayat
        .+=========================.
        :++===++==================-       :++-          󱄅 os   CachyOS x86_64
          :*++====+++++=============-        .==:           cpu  11th Gen Intel(R) Core(TM) i5-11400H (12) @ 4.50 GHz
         -*+++=====+***++==========:                       󰘚 ram  5.30 GiB / 15.34 GiB (35%)
        =*++++========------------:                         sh   zsh 5.9.2
        =*+++++=====-                     ...
        .+*+++++=-===:                    .=+++=:             ● ● ● ● ● ● ●
        :++++=====-==:                     -*****+
        :++========-=.                      .=+**+.
        .+==========-.                          .
        :+++++++====-                                .--==-.
        :++==========.                             :+++++++:
        .-===========.                            =*****+*+
        .-===========:                           .+*****+:
        -=======++++:::::::::::::::::::::::::-:  .---:
        :======++++====+++******************=.
        :=====+++==========++++++++++++++*-
        .====++==============++++++++++*-
        .===+==================+++++++:
        .-=======================+++:
        ..........................
        ➜  DAA - Assignment - 1 git:(feature/mergesort) ✗ mvn test -Dtest=MergeSortTest
zsh: command not found: mvn
➜  DAA - Assignment - 1 git:(feature/mergesort) ✗ ./mvnw test -Dtest=MergeSortTest
zsh: Нет такого файла или каталога: ./mvnw
➜  DAA - Assignment - 1 git:(feature/mergesort) ✗ sudo pacman -S maven
[sudo] пароль для nursayat:
разрешение зависимостей...
проверка конфликтов...

Пакет (1)    Новая версия  Изменение размера  Размер загрузки

extra/maven  3.9.16-1              10,37 MiB         8,56 MiB

Будет загружено:     8,56 MiB
Будет установлено:  10,37 MiB

:: Приступить к установке? [Y/n]
        :: Получение пакетов...
maven-3.9.16-1-any                   8,6 MiB  1866 KiB/s 00:05 [-----------------------------------] 100%
        (1/1) проверка ключей                                           [-----------------------------------] 100%
        (1/1) проверка целостности пакета                               [-----------------------------------] 100%
        (1/1) загрузка файлов пакетов                                   [-----------------------------------] 100%
        (1/1) проверка конфликтов файлов                                [-----------------------------------] 100%
        :: Обработка изменений пакета...
        (1/1) установка maven                                           [-----------------------------------] 100%
        :: Запуск post-transaction hooks...
        (1/1) Arming ConditionNeedsUpdate...
        ➜  DAA - Assignment - 1 git:(feature/mergesort) ✗ ./mvnw test -Dtest=MergeSortTest
➜  DAA - Assignment - 1 git:(feature/mergesort) ✗ mvn test -Dtest=MergeSortTest

[INFO] Scanning for projects...
        [INFO]
        [INFO] ------------------< kz.astanait.daa:DAA-Assignment-1 >------------------
        [INFO] Building DAA-Assignment-1 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
        [INFO]
        [INFO] --- resources:3.4.0:resources (default-resources) @ DAA-Assignment-1 ---
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-filtering/3.4.0/maven-filtering-3.4.0.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-filtering/3.4.0/maven-filtering-3.4.0.jar (56 kB at 71 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-api/1.7.36/slf4j-api-1.7.36.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/plexus/plexus-build-api/0.0.7/plexus-build-api-0.0.7.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/4.0.2/plexus-utils-4.0.2.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-xml/3.0.1/plexus-xml-3.0.1.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.27/plexus-interpolation-1.27.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-api/1.7.36/slf4j-api-1.7.36.jar (41 kB at 254 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.16.1/commons-io-2.16.1.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/plexus/plexus-build-api/0.0.7/plexus-build-api-0.0.7.jar (8.5 kB at 20 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-lang3/3.20.0/commons-lang3-3.20.0.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-xml/3.0.1/plexus-xml-3.0.1.jar (94 kB at 165 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/javax/inject/javax.inject/1/javax.inject-1.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.27/plexus-interpolation-1.27.jar (86 kB at 129 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/javax/inject/javax.inject/1/javax.inject-1.jar (2.5 kB at 3.3 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.16.1/commons-io-2.16.1.jar (509 kB at 647 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/4.0.2/plexus-utils-4.0.2.jar (193 kB at 231 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-lang3/3.20.0/commons-lang3-3.20.0.jar (714 kB at 599 kB/s)
        [INFO] Copying 0 resource from src/main/resources to target/classes
[INFO]
        [INFO] --- compiler:3.15.0:compile (default-compile) @ DAA-Assignment-1 ---
Downloading from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm/9.9.1/asm-9.9.1.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm/9.9.1/asm-9.9.1.jar (126 kB at 417 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/3.4.2/maven-shared-utils-3.4.2.jar
Downloading from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.11.0/commons-io-2.11.0.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-incremental/1.1/maven-shared-incremental-1.1.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-java/1.5.2/plexus-java-1.5.2.jar
Downloading from central: https://repo.maven.apache.org/maven2/com/thoughtworks/qdox/qdox/2.2.0/qdox-2.2.0.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-incremental/1.1/maven-shared-incremental-1.1.jar (14 kB at 79 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-api/2.16.2/plexus-compiler-api-2.16.2.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-java/1.5.2/plexus-java-1.5.2.jar (57 kB at 211 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-manager/2.16.2/plexus-compiler-manager-2.16.2.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/3.4.2/maven-shared-utils-3.4.2.jar (151 kB at 521 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-javac/2.16.2/plexus-compiler-javac-2.16.2.jar
Downloaded from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.11.0/commons-io-2.11.0.jar (327 kB at 901 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-api/2.16.2/plexus-compiler-api-2.16.2.jar (29 kB at 79 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-manager/2.16.2/plexus-compiler-manager-2.16.2.jar (5.2 kB at 12 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-javac/2.16.2/plexus-compiler-javac-2.16.2.jar (30 kB at 69 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/com/thoughtworks/qdox/qdox/2.2.0/qdox-2.2.0.jar (353 kB at 359 kB/s)
        [INFO] Recompiling the module because of added or removed source files.
[INFO] Compiling 2 source files with javac [debug target 26] to target/classes
        [INFO]
        [INFO] --- resources:3.4.0:testResources (default-testResources) @ DAA-Assignment-1 ---
        [INFO] skip non existing resourceDirectory /home/nursayat/IdeaProjects/DAA - Assignment - 1/src/test/resources
        [INFO]
        [INFO] --- compiler:3.15.0:testCompile (default-testCompile) @ DAA-Assignment-1 ---
        [INFO] Recompiling the module because of changed dependency.
        [INFO] Compiling 1 source file with javac [debug target 26] to target/test-classes
        [INFO]
        [INFO] --- surefire:3.5.4:test (default-test) @ DAA-Assignment-1 ---
        Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-api/3.5.4/surefire-api-3.5.4.jar
        Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-api/3.5.4/surefire-api-3.5.4.jar (174 kB at 639 kB/s)
        Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-logger-api/3.5.4/surefire-logger-api-3.5.4.jar
        Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-shared-utils/3.5.4/surefire-shared-utils-3.5.4.jar
        Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-extensions-api/3.5.4/surefire-extensions-api-3.5.4.jar
        Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/maven-surefire-common/3.5.4/maven-surefire-common-3.5.4.jar
        Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-booter/3.5.4/surefire-booter-3.5.4.jar
        Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-logger-api/3.5.4/surefire-logger-api-3.5.4.jar (14 kB at 75 kB/s)
        Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-extensions-spi/3.5.4/surefire-extensions-spi-3.5.4.jar
        Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-extensions-api/3.5.4/surefire-extensions-api-3.5.4.jar (26 kB at 121 kB/s)
        Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/resolver/maven-resolver-util/1.4.1/maven-resolver-util-1.4.1.jar
        Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-booter/3.5.4/surefire-booter-3.5.4.jar (119 kB at 458 kB/s)
        Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/resolver/maven-resolver-api/1.4.1/maven-resolver-api-1.4.1.jar
        Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-extensions-spi/3.5.4/surefire-extensions-spi-3.5.4.jar (8.2 kB at 24 kB/s)
        Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-common-artifact-filters/3.4.0/maven-common-artifact-filters-3.4.0.jar
        Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/maven-surefire-common/3.5.4/maven-surefire-common-3.5.4.jar (314 kB at 713 kB/s)
        Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-java/1.5.0/plexus-java-1.5.0.jar
        Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/resolver/maven-resolver-util/1.4.1/maven-resolver-util-1.4.1.jar (168 kB at 360 kB/s)
        Downloading from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm/9.8/asm-9.8.jar
        Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/resolver/maven-resolver-api/1.4.1/maven-resolver-api-1.4.1.jar (149 kB at 288 kB/s)
        Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-common-artifact-filters/3.4.0/maven-common-artifact-filters-3.4.0.jar (58 kB at 105 kB/s)
        Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-java/1.5.0/plexus-java-1.5.0.jar (57 kB at 95 kB/s)
        Downloaded from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm/9.8/asm-9.8.jar (126 kB at 194 kB/s)
        Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-shared-utils/3.5.4/surefire-shared-utils-3.5.4.jar (2.9 MB at 2.1 MB/s)
        [INFO] Using auto detected provider org.apache.maven.surefire.junitplatform.JUnitPlatformProvider
        Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-junit-platform/3.5.4/surefire-junit-platform-3.5.4.pom
        Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-junit-platform/3.5.4/surefire-junit-platform-3.5.4.pom (5.2 kB at 25 kB/s)
        Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-providers/3.5.4/surefire-providers-3.5.4.pom
        Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-providers/3.5.4/surefire-providers-3.5.4.pom (2.5 kB at 22 kB/s)
        Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/common-java5/3.5.4/common-java5-3.5.4.pom
        Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/common-java5/3.5.4/common-java5-3.5.4.pom (3.1 kB at 23 kB/s)
        Downloading from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-engine/1.12.1/junit-platform-engine-1.12.1.pom
        Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-engine/1.12.1/junit-platform-engine-1.12.1.pom (3.2 kB at 19 kB/s)
        Downloading from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-commons/1.12.1/junit-platform-commons-1.12.1.pom
        Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-commons/1.12.1/junit-platform-commons-1.12.1.pom (2.8 kB at 17 kB/s)
        Downloading from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-launcher/1.12.1/junit-platform-launcher-1.12.1.pom
        Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-launcher/1.12.1/junit-platform-launcher-1.12.1.pom (3.0 kB at 25 kB/s)
        Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-junit-platform/3.5.4/surefire-junit-platform-3.5.4.jar
        Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-junit-platform/3.5.4/surefire-junit-platform-3.5.4.jar (35 kB at 257 kB/s)
        Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/common-java5/3.5.4/common-java5-3.5.4.jar
        Downloading from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-engine/1.12.1/junit-platform-engine-1.12.1.jar
        Downloading from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-commons/1.12.1/junit-platform-commons-1.12.1.jar
        Downloading from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-launcher/1.12.1/junit-platform-launcher-1.12.1.jar
        Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-commons/1.12.1/junit-platform-commons-1.12.1.jar (152 kB at 600 kB/s)
        Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/common-java5/3.5.4/common-java5-3.5.4.jar (18 kB at 68 kB/s)
        Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-engine/1.12.1/junit-platform-engine-1.12.1.jar (256 kB at 711 kB/s)
        Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-launcher/1.12.1/junit-platform-launcher-1.12.1.jar (208 kB at 561 kB/s)
        [INFO]
        [INFO] -------------------------------------------------------
        [INFO]  T E S T S
        [INFO] -------------------------------------------------------
        [INFO] Running daa.algorithms.MergeSortTest
        [INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.077 s -- in daa.algorithms.MergeSortTest
        [INFO]
        [INFO] Results:
        [INFO]
        [INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0
        [INFO]
        [INFO] ------------------------------------------------------------------------
        [INFO] BUILD SUCCESS
        [INFO] ------------------------------------------------------------------------
        [INFO] Total time:  8.460 s
        [INFO] Finished at: 2026-09-16T15:31:34+05:00
        [INFO] ------------------------------------------------------------------------
        ➜  DAA - Assignment - 1 git:(feature/mergesort) ✗
        ➜  DAA - Assignment - 1 git:(feature/mergesort) ✗ git add src/main/java/daa/algorithms/MergeSort.java src/test/java/daa/algorithms/MergeSortTest.java
        git commit -m "feat(mergesort): implement MergeSort with single buffer and insertion cutoff"
        [feature/mergesort 49e6de4] feat(mergesort): implement MergeSort with single buffer and insertion cutoff
        2 files changed, 146 insertions(+)
        create mode 100644 src/main/java/daa/algorithms/MergeSort.java
        create mode 100644 src/test/java/daa/algorithms/MergeSortTest.java
        ➜  DAA - Assignment - 1 git:(feature/mergesort) git checkout main
        git merge feature/mergesort
        git checkout -b feature/quicksort
        Переключились на ветку «main»
        Обновление 98645ea..49e6de4
        Fast-forward
        src/main/java/daa/algorithms/MergeSort.java     | 76 +++++++++++++++++++++++++++++++++++++++++++++++++++
        src/test/java/daa/algorithms/MergeSortTest.java | 70 +++++++++++++++++++++++++++++++++++++++++++++++
        2 files changed, 146 insertions(+)
        create mode 100644 src/main/java/daa/algorithms/MergeSort.java
        create mode 100644 src/test/java/daa/algorithms/MergeSortTest.java
        Переключились на новую ветку «feature/quicksort»
        ➜  DAA - Assignment - 1 git:(feature/quicksort) mvn test -Dtest=QuickSortTest
        [INFO] Scanning for projects...
        [INFO]
        [INFO] ------------------< kz.astanait.daa:DAA-Assignment-1 >------------------
        [INFO] Building DAA-Assignment-1 1.0-SNAPSHOT
        [INFO]   from pom.xml
        [INFO] --------------------------------[ jar ]---------------------------------
        [INFO]
        [INFO] --- resources:3.4.0:resources (default-resources) @ DAA-Assignment-1 ---
        [INFO] Copying 0 resource from src/main/resources to target/classes
        [INFO]
        [INFO] --- compiler:3.15.0:compile (default-compile) @ DAA-Assignment-1 ---
        [INFO] Recompiling the module because of changed source code.
        [INFO] Compiling 3 source files with javac [debug target 26] to target/classes
        [INFO]
        [INFO] --- resources:3.4.0:testResources (default-testResources) @ DAA-Assignment-1 ---
        [INFO] skip non existing resourceDirectory /home/nursayat/IdeaProjects/DAA - Assignment - 1/src/test/resources
        [INFO]
        [INFO] --- compiler:3.15.0:testCompile (default-testCompile) @ DAA-Assignment-1 ---
        [INFO] Recompiling the module because of changed dependency.
        [INFO] Compiling 2 source files with javac [debug target 26] to target/test-classes
        [INFO]
        [INFO] --- surefire:3.5.4:test (default-test) @ DAA-Assignment-1 ---
        [INFO] Using auto detected provider org.apache.maven.surefire.junitplatform.JUnitPlatformProvider
        [INFO]
        [INFO] -------------------------------------------------------
        [INFO]  T E S T S
        [INFO] -------------------------------------------------------
        [INFO] Running daa.algorithms.QuickSortTest
        [INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.096 s -- in daa.algorithms.QuickSortTest
        [INFO]
        [INFO] Results:
        [INFO]
        [INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0
        [INFO]
        [INFO] ------------------------------------------------------------------------
        [INFO] BUILD SUCCESS
        [INFO] ------------------------------------------------------------------------
        [INFO] Total time:  1.864 s
        [INFO] Finished at: 2026-09-16T15:42:24+05:00
        [INFO] ------------------------------------------------------------------------
        ➜  DAA - Assignment - 1 git:(feature/quicksort) ✗ git add src/main/java/daa/algorithms/QuickSort.java src/test/java/daa/algorithms/QuickSortTest.java
        git commit -m "feat(quicksort): implement QuickSort with 3-way partition and bounded recursion depth"
        [feature/quicksort e6c5ceb] feat(quicksort): implement QuickSort with 3-way partition and bounded recursion depth
        2 files changed, 151 insertions(+)
        create mode 100644 src/main/java/daa/algorithms/QuickSort.java
        create mode 100644 src/test/java/daa/algorithms/QuickSortTest.java
        ➜  DAA - Assignment - 1 git:(feature/quicksort) ✗ git checkout main
        git merge feature/quicksort
        git checkout -b feature/select
        M       src/test/java/daa/algorithms/MergeSortTest.java
        Переключились на ветку «main»
        Обновление 49e6de4..e6c5ceb
        Fast-forward
        src/main/java/daa/algorithms/QuickSort.java     | 76 +++++++++++++++++++++++++++++++++++++++++++++++++++
        src/test/java/daa/algorithms/QuickSortTest.java | 75 ++++++++++++++++++++++++++++++++++++++++++++++++++
        2 files changed, 151 insertions(+)
        create mode 100644 src/main/java/daa/algorithms/QuickSort.java
        create mode 100644 src/test/java/daa/algorithms/QuickSortTest.java
        Переключились на новую ветку «feature/select»
        ➜  DAA - Assignment - 1 git:(feature/select) ✗ mvn test -Dtest=QuickSelectTest
        [INFO] Scanning for projects...
        [INFO]
        [INFO] ------------------< kz.astanait.daa:DAA-Assignment-1 >------------------
        [INFO] Building DAA-Assignment-1 1.0-SNAPSHOT
        [INFO]   from pom.xml
        [INFO] --------------------------------[ jar ]---------------------------------
        [INFO]
        [INFO] --- resources:3.4.0:resources (default-resources) @ DAA-Assignment-1 ---
        [INFO] Copying 0 resource from src/main/resources to target/classes
        [INFO]
        [INFO] --- compiler:3.15.0:compile (default-compile) @ DAA-Assignment-1 ---
        [INFO] Recompiling the module because of changed source code.
        [INFO] Compiling 4 source files with javac [debug target 26] to target/classes
        [INFO]
        [INFO] --- resources:3.4.0:testResources (default-testResources) @ DAA-Assignment-1 ---
        [INFO] skip non existing resourceDirectory /home/nursayat/IdeaProjects/DAA - Assignment - 1/src/test/resources
        [INFO]
        [INFO] --- compiler:3.15.0:testCompile (default-testCompile) @ DAA-Assignment-1 ---
        [INFO] Recompiling the module because of changed dependency.
        [INFO] Compiling 3 source files with javac [debug target 26] to target/test-classes
        [INFO]
        [INFO] --- surefire:3.5.4:test (default-test) @ DAA-Assignment-1 ---
        [INFO] Using auto detected provider org.apache.maven.surefire.junitplatform.JUnitPlatformProvider
        [INFO]
        [INFO] -------------------------------------------------------
        [INFO]  T E S T S
        [INFO] -------------------------------------------------------
        [INFO] Running daa.algorithms.QuickSelectTest
        [INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.085 s -- in daa.algorithms.QuickSelectTest
        [INFO]
        [INFO] Results:
        [INFO]
        [INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0
        [INFO]
        [INFO] ------------------------------------------------------------------------
        [INFO] BUILD SUCCESS
        [INFO] ------------------------------------------------------------------------
        [INFO] Total time:  1.899 s
        [INFO] Finished at: 2026-09-16T15:44:30+05:00
        [INFO] ------------------------------------------------------------------------
        ➜  DAA - Assignment - 1 git:(feature/select) ✗ git add src/main/java/daa/algorithms/QuickSelect.java src/test/java/daa/algorithms/QuickSelectTest.java
        git commit -m "feat(select): implement QuickSelect using 3-way partition with input validation"
        [feature/select b1fe24f] feat(select): implement QuickSelect using 3-way partition with input validation
        2 files changed, 116 insertions(+)
        create mode 100644 src/main/java/daa/algorithms/QuickSelect.java
        create mode 100644 src/test/java/daa/algorithms/QuickSelectTest.java
        ➜  DAA - Assignment - 1 git:(feature/select) ✗ # 1. Commit any modified test files
        git add src/test/java/daa/algorithms/MergeSortTest.java
        git commit -m "style(mergesort): translate comments to English" 2>/dev/null || true

        # 2. Merge feature/select into main
        git checkout main
        git merge feature/select

        # 3. Switch back to feature/metrics to complete benchmark suite
        git checkout feature/metrics
        git merge main
        [feature/select 72d177a] style(mergesort): translate comments to English
        1 file changed, 4 insertions(+), 4 deletions(-)
        Переключились на ветку «main»
        Обновление e6c5ceb..72d177a
        Fast-forward
        src/main/java/daa/algorithms/QuickSelect.java     | 49 ++++++++++++++++++++++++++++++++++++
        src/test/java/daa/algorithms/MergeSortTest.java   |  8 +++---
        src/test/java/daa/algorithms/QuickSelectTest.java | 67 +++++++++++++++++++++++++++++++++++++++++++++++++
        3 files changed, 120 insertions(+), 4 deletions(-)
        create mode 100644 src/main/java/daa/algorithms/QuickSelect.java
        create mode 100644 src/test/java/daa/algorithms/QuickSelectTest.java
        Переключились на ветку «feature/metrics»
        Обновление 98645ea..72d177a
        Fast-forward
        src/main/java/daa/algorithms/MergeSort.java       | 76 +++++++++++++++++++++++++++++++++++++++++++++++++
        src/main/java/daa/algorithms/QuickSelect.java     | 49 +++++++++++++++++++++++++++++++
        src/main/java/daa/algorithms/QuickSort.java       | 76 +++++++++++++++++++++++++++++++++++++++++++++++++
        src/test/java/daa/algorithms/MergeSortTest.java   | 70 +++++++++++++++++++++++++++++++++++++++++++++
        src/test/java/daa/algorithms/QuickSelectTest.java | 67 +++++++++++++++++++++++++++++++++++++++++++
        src/test/java/daa/algorithms/QuickSortTest.java   | 75 ++++++++++++++++++++++++++++++++++++++++++++++++
        6 files changed, 413 insertions(+)
        create mode 100644 src/main/java/daa/algorithms/MergeSort.java
        create mode 100644 src/main/java/daa/algorithms/QuickSelect.java
        create mode 100644 src/main/java/daa/algorithms/QuickSort.java
        create mode 100644 src/test/java/daa/algorithms/MergeSortTest.java
        create mode 100644 src/test/java/daa/algorithms/QuickSelectTest.java
        create mode 100644 src/test/java/daa/algorithms/QuickSortTest.java
        ➜  DAA - Assignment - 1 git:(feature/metrics) >....
        for (int i = 0; i < n; i++) {
        arr[i] = i;
        }
        }
        case DUPLICATES -> {
        // Random values strictly between 0 and 9
        for (int i = 0; i < n; i++) {
        arr[i] = rnd.nextInt(10);
        }
        }
        }
        return arr;
        }
        }
        EOF
        ➜  DAA - Assignment - 1 git:(feature/metrics) ✗ >....
        type.getLabel(),
        n,
        median.timeMs(),
        median.comparisons(),
        median.maxDepth()
        ));
        }
        }
        }
        return results;
        }

        private record RunData(double timeMs, long comparisons, int maxDepth) {}
        }
        EOF
        ➜  DAA - Assignment - 1 git:(feature/metrics) ✗ mvn compile
        [INFO] Scanning for projects...
        [INFO]
        [INFO] ------------------< kz.astanait.daa:DAA-Assignment-1 >------------------
        [INFO] Building DAA-Assignment-1 1.0-SNAPSHOT
        [INFO]   from pom.xml
        [INFO] --------------------------------[ jar ]---------------------------------
        [INFO]
        [INFO] --- resources:3.4.0:resources (default-resources) @ DAA-Assignment-1 ---
        [INFO] Copying 0 resource from src/main/resources to target/classes
        [INFO]
        [INFO] --- compiler:3.15.0:compile (default-compile) @ DAA-Assignment-1 ---
        [INFO] Recompiling the module because of changed source code.
        [INFO] Compiling 10 source files with javac [debug target 26] to target/classes
        [INFO] /home/nursayat/IdeaProjects/DAA - Assignment - 1/src/main/java/daa/bench/Benchmark.java: /home/nursayat/IdeaProjects/DAA - Assignment - 1/src/main/java/daa/bench/Benchmark.java uses unchecked or unsafe operations.
        [INFO] /home/nursayat/IdeaProjects/DAA - Assignment - 1/src/main/java/daa/bench/Benchmark.java: Recompile with -Xlint:unchecked for details.
        [INFO] -------------------------------------------------------------
        [ERROR] COMPILATION ERROR :
        [INFO] -------------------------------------------------------------
        [ERROR] /home/nursayat/IdeaProjects/DAA - Assignment - 1/src/main/java/daa/bench/Benchmark.java:[52,46] incompatible types: java.lang.Object cannot be converted to daa.bench.Benchmark.RunData
        [ERROR] /home/nursayat/IdeaProjects/DAA - Assignment - 1/src/main/java/daa/bench/CsvWriter.java:[17,34] incompatible types: java.lang.Object cannot be converted to daa.bench.Result
        [INFO] 2 errors
        [INFO] -------------------------------------------------------------
        [INFO] ------------------------------------------------------------------------
        [INFO] BUILD FAILURE
        [INFO] ------------------------------------------------------------------------
        [INFO] Total time:  0.715 s
        [INFO] Finished at: 2026-09-16T16:00:05+05:00
        [INFO] ------------------------------------------------------------------------
        [ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.15.0:compile (default-compile) on project DAA-Assignment-1: Compilation failure: Compilation failure:
        [ERROR] /home/nursayat/IdeaProjects/DAA - Assignment - 1/src/main/java/daa/bench/Benchmark.java:[52,46] incompatible types: java.lang.Object cannot be converted to daa.bench.Benchmark.RunData
        [ERROR] /home/nursayat/IdeaProjects/DAA - Assignment - 1/src/main/java/daa/bench/CsvWriter.java:[17,34] incompatible types: java.lang.Object cannot be converted to daa.bench.Result
        [ERROR] -> [Help 1]
        [ERROR]
        [ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
        [ERROR] Re-run Maven using the -X switch to enable full debug logging.
        [ERROR]
        [ERROR] For more information about the errors and possible solutions, please read the following articles:
        [ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
        ➜  DAA - Assignment - 1 git:(feature/metrics) ✗ mvn compile
        [INFO] Scanning for projects...
        [INFO]
        [INFO] ------------------< kz.astanait.daa:DAA-Assignment-1 >------------------
        [INFO] Building DAA-Assignment-1 1.0-SNAPSHOT
        [INFO]   from pom.xml
        [INFO] --------------------------------[ jar ]---------------------------------
        [INFO]
        [INFO] --- resources:3.4.0:resources (default-resources) @ DAA-Assignment-1 ---
        [INFO] Copying 0 resource from src/main/resources to target/classes
        [INFO]
        [INFO] --- compiler:3.15.0:compile (default-compile) @ DAA-Assignment-1 ---
        [INFO] Recompiling the module because of changed source code.
        [INFO] Compiling 10 source files with javac [debug target 26] to target/classes
        [INFO] /home/nursayat/IdeaProjects/DAA - Assignment - 1/src/main/java/daa/bench/Benchmark.java: /home/nursayat/IdeaProjects/DAA - Assignment - 1/src/main/java/daa/bench/Benchmark.java uses unchecked or unsafe operations.
        [INFO] /home/nursayat/IdeaProjects/DAA - Assignment - 1/src/main/java/daa/bench/Benchmark.java: Recompile with -Xlint:unchecked for details.
        [INFO] -------------------------------------------------------------
        [ERROR] COMPILATION ERROR :
        [INFO] -------------------------------------------------------------
        [ERROR] /home/nursayat/IdeaProjects/DAA - Assignment - 1/src/main/java/daa/bench/Benchmark.java:[51,46] incompatible types: java.lang.Object cannot be converted to daa.bench.Benchmark.RunData
        [ERROR] /home/nursayat/IdeaProjects/DAA - Assignment - 1/src/main/java/daa/bench/CsvWriter.java:[16,34] incompatible types: java.lang.Object cannot be converted to daa.bench.Result
        [INFO] 2 errors
        [INFO] -------------------------------------------------------------
        [INFO] ------------------------------------------------------------------------
        [INFO] BUILD FAILURE
        [INFO] ------------------------------------------------------------------------
        [INFO] Total time:  0.710 s
        [INFO] Finished at: 2026-09-16T16:01:27+05:00
        [INFO] ------------------------------------------------------------------------
        [ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.15.0:compile (default-compile) on project DAA-Assignment-1: Compilation failure: Compilation failure:
        [ERROR] /home/nursayat/IdeaProjects/DAA - Assignment - 1/src/main/java/daa/bench/Benchmark.java:[51,46] incompatible types: java.lang.Object cannot be converted to daa.bench.Benchmark.RunData
        [ERROR] /home/nursayat/IdeaProjects/DAA - Assignment - 1/src/main/java/daa/bench/CsvWriter.java:[16,34] incompatible types: java.lang.Object cannot be converted to daa.bench.Result
        [ERROR] -> [Help 1]
        [ERROR]
        [ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
        [ERROR] Re-run Maven using the -X switch to enable full debug logging.
        [ERROR]
        [ERROR] For more information about the errors and possible solutions, please read the following articles:
        [ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
        ➜  DAA - Assignment - 1 git:(feature/metrics) ✗ >....
        n,
        median.timeMs(),
        median.comparisons(),
        median.maxDepth()
        ));
        }
        }
        }
        return results;
        }

        private record RunData(double timeMs, long comparisons, int maxDepth) {}
        }
        """)
'
➜  DAA - Assignment - 1 git:(feature/metrics) ✗ mvn compile
[INFO] Scanning for projects...
[INFO]
[INFO] ------------------< kz.astanait.daa:DAA-Assignment-1 >------------------
[INFO] Building DAA-Assignment-1 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] --- resources:3.4.0:resources (default-resources) @ DAA-Assignment-1 ---
[INFO] Copying 0 resource from src/main/resources to target/classes
[INFO]
[INFO] --- compiler:3.15.0:compile (default-compile) @ DAA-Assignment-1 ---
[INFO] Recompiling the module because of changed source code.
[INFO] Compiling 10 source files with javac [debug target 26] to target/classes
[INFO] /home/nursayat/IdeaProjects/DAA - Assignment - 1/src/main/java/daa/bench/Benchmark.java: /home/nursayat/IdeaProjects/DAA - Assignment - 1/src/main/java/daa/bench/Benchmark.java uses unchecked or unsafe operations.
[INFO] /home/nursayat/IdeaProjects/DAA - Assignment - 1/src/main/java/daa/bench/Benchmark.java: Recompile with -Xlint:unchecked for details.
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR :
[INFO] -------------------------------------------------------------
[ERROR] /home/nursayat/IdeaProjects/DAA - Assignment - 1/src/main/java/daa/bench/Benchmark.java:[51,46] incompatible types: java.lang.Object cannot be converted to daa.bench.Benchmark.RunData
[ERROR] /home/nursayat/IdeaProjects/DAA - Assignment - 1/src/main/java/daa/bench/CsvWriter.java:[16,34] incompatible types: java.lang.Object cannot be converted to daa.bench.Result
[INFO] 2 errors
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  0.765 s
[INFO] Finished at: 2026-09-16T16:04:54+05:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.15.0:compile (default-compile) on project DAA-Assignment-1: Compilation failure: Compilation failure:
[ERROR] /home/nursayat/IdeaProjects/DAA - Assignment - 1/src/main/java/daa/bench/Benchmark.java:[51,46] incompatible types: java.lang.Object cannot be converted to daa.bench.Benchmark.RunData
[ERROR] /home/nursayat/IdeaProjects/DAA - Assignment - 1/src/main/java/daa/bench/CsvWriter.java:[16,34] incompatible types: java.lang.Object cannot be converted to daa.bench.Result
[ERROR] -> [Help 1]
[ERROR]
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR]
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
➜  DAA - Assignment - 1 git:(feature/metrics) ✗ mvn compile
[INFO] Scanning for projects...
[INFO]
[INFO] ------------------< kz.astanait.daa:DAA-Assignment-1 >------------------
[INFO] Building DAA-Assignment-1 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] --- resources:3.4.0:resources (default-resources) @ DAA-Assignment-1 ---
[INFO] Copying 0 resource from src/main/resources to target/classes
[INFO]
[INFO] --- compiler:3.15.0:compile (default-compile) @ DAA-Assignment-1 ---
[INFO] Recompiling the module because of changed source code.
[INFO] Compiling 10 source files with javac [debug target 26] to target/classes
[INFO] /home/nursayat/IdeaProjects/DAA - Assignment - 1/src/main/java/daa/bench/Benchmark.java: /home/nursayat/IdeaProjects/DAA - Assignment - 1/src/main/java/daa/bench/Benchmark.java uses unchecked or unsafe operations.
[INFO] /home/nursayat/IdeaProjects/DAA - Assignment - 1/src/main/java/daa/bench/Benchmark.java: Recompile with -Xlint:unchecked for details.
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR :
[INFO] -------------------------------------------------------------
[ERROR] /home/nursayat/IdeaProjects/DAA - Assignment - 1/src/main/java/daa/bench/Benchmark.java:[51,46] incompatible types: java.lang.Object cannot be converted to daa.bench.Benchmark.RunData
[ERROR] /home/nursayat/IdeaProjects/DAA - Assignment - 1/src/main/java/daa/bench/CsvWriter.java:[16,34] incompatible types: java.lang.Object cannot be converted to daa.bench.Result
[INFO] 2 errors
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  0.743 s
[INFO] Finished at: 2026-09-16T16:10:06+05:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.15.0:compile (default-compile) on project DAA-Assignment-1: Compilation failure: Compilation failure:
[ERROR] /home/nursayat/IdeaProjects/DAA - Assignment - 1/src/main/java/daa/bench/Benchmark.java:[51,46] incompatible types: java.lang.Object cannot be converted to daa.bench.Benchmark.RunData
[ERROR] /home/nursayat/IdeaProjects/DAA - Assignment - 1/src/main/java/daa/bench/CsvWriter.java:[16,34] incompatible types: java.lang.Object cannot be converted to daa.bench.Result
[ERROR] -> [Help 1]
[ERROR]
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR]
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
➜  DAA - Assignment - 1 git:(feature/metrics) ✗ mvn compile
[INFO] Scanning for projects...
[INFO]
[INFO] ------------------< kz.astanait.daa:DAA-Assignment-1 >------------------
[INFO] Building DAA-Assignment-1 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] --- resources:3.4.0:resources (default-resources) @ DAA-Assignment-1 ---
[INFO] Copying 0 resource from src/main/resources to target/classes
[INFO]
[INFO] --- compiler:3.15.0:compile (default-compile) @ DAA-Assignment-1 ---
[INFO] Recompiling the module because of changed source code.
[INFO] Compiling 10 source files with javac [debug target 26] to target/classes
[INFO] /home/nursayat/IdeaProjects/DAA - Assignment - 1/src/main/java/daa/Main.java: Some input files use unchecked or unsafe operations.
[INFO] /home/nursayat/IdeaProjects/DAA - Assignment - 1/src/main/java/daa/Main.java: Recompile with -Xlint:unchecked for details.
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  0.757 s
[INFO] Finished at: 2026-09-16T16:16:17+05:00
[INFO] ------------------------------------------------------------------------
➜  DAA - Assignment - 1 git:(feature/metrics) ✗ mvn compile exec:java -Dexec.mainClass="daa.Main"
[INFO] Scanning for projects...
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-metadata.xml
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/mojo/maven-metadata.xml
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-metadata.xml (10 kB at 13 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/mojo/maven-metadata.xml (20 kB at 25 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/mojo/exec-maven-plugin/maven-metadata.xml
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/mojo/exec-maven-plugin/maven-metadata.xml (1.2 kB at 8.8 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/mojo/exec-maven-plugin/3.6.4/exec-maven-plugin-3.6.4.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/mojo/exec-maven-plugin/3.6.4/exec-maven-plugin-3.6.4.pom (16 kB at 122 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/mojo/mojo-parent/97/mojo-parent-97.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/mojo/mojo-parent/97/mojo-parent-97.pom (39 kB at 263 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.14.4/junit-bom-5.14.4.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.14.4/junit-bom-5.14.4.pom (5.7 kB at 39 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/mojo/exec-maven-plugin/3.6.4/exec-maven-plugin-3.6.4.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/mojo/exec-maven-plugin/3.6.4/exec-maven-plugin-3.6.4.jar (94 kB at 381 kB/s)
[INFO]
[INFO] ------------------< kz.astanait.daa:DAA-Assignment-1 >------------------
[INFO] Building DAA-Assignment-1 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] --- resources:3.4.0:resources (default-resources) @ DAA-Assignment-1 ---
[INFO] Copying 0 resource from src/main/resources to target/classes
[INFO]
[INFO] --- compiler:3.15.0:compile (default-compile) @ DAA-Assignment-1 ---
[INFO] Nothing to compile - all classes are up to date.
[INFO]
[INFO] --- exec:3.6.4:java (default-cli) @ DAA-Assignment-1 ---
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/resolver/maven-resolver-util/1.9.24/maven-resolver-util-1.9.24.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/resolver/maven-resolver-util/1.9.24/maven-resolver-util-1.9.24.pom (2.2 kB at 18 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/resolver/maven-resolver/1.9.24/maven-resolver-1.9.24.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/resolver/maven-resolver/1.9.24/maven-resolver-1.9.24.pom (25 kB at 134 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/resolver/maven-resolver-api/1.9.24/maven-resolver-api-1.9.24.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/resolver/maven-resolver-api/1.9.24/maven-resolver-api-1.9.24.pom (2.2 kB at 15 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/4.1.0/plexus-utils-4.1.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/4.1.0/plexus-utils-4.1.0.pom (7.8 kB at 52 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/27/plexus-27.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/27/plexus-27.pom (36 kB at 242 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-exec/1.6.0/commons-exec-1.6.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-exec/1.6.0/commons-exec-1.6.0.pom (11 kB at 72 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/93/commons-parent-93.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/93/commons-parent-93.pom (79 kB at 522 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm/9.10.1/asm-9.10.1.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm/9.10.1/asm-9.10.1.pom (2.4 kB at 17 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-commons/9.10.1/asm-commons-9.10.1.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-commons/9.10.1/asm-commons-9.10.1.pom (2.8 kB at 19 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-tree/9.10.1/asm-tree-9.10.1.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-tree/9.10.1/asm-tree-9.10.1.pom (2.6 kB at 18 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/resolver/maven-resolver-util/1.9.24/maven-resolver-util-1.9.24.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/resolver/maven-resolver-util/1.9.24/maven-resolver-util-1.9.24.jar (196 kB at 655 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/resolver/maven-resolver-api/1.9.24/maven-resolver-api-1.9.24.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/4.1.0/plexus-utils-4.1.0.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-exec/1.6.0/commons-exec-1.6.0.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm/9.10.1/asm-9.10.1.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-commons/9.10.1/asm-commons-9.10.1.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-exec/1.6.0/commons-exec-1.6.0.jar (69 kB at 220 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-tree/9.10.1/asm-tree-9.10.1.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/4.1.0/plexus-utils-4.1.0.jar (193 kB at 605 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-tree/9.10.1/asm-tree-9.10.1.jar (52 kB at 96 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-commons/9.10.1/asm-commons-9.10.1.jar (75 kB at 125 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm/9.10.1/asm-9.10.1.jar (126 kB at 184 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/resolver/maven-resolver-api/1.9.24/maven-resolver-api-1.9.24.jar (157 kB at 204 kB/s)
Starting benchmark suite...
Running MergeSort   | Input: random     | n = 1000...
Running MergeSort   | Input: random     | n = 10000...
Running MergeSort   | Input: random     | n = 100000...
Running MergeSort   | Input: random     | n = 1000000...
Running MergeSort   | Input: sorted     | n = 1000...
Running MergeSort   | Input: sorted     | n = 10000...
Running MergeSort   | Input: sorted     | n = 100000...
Running MergeSort   | Input: sorted     | n = 1000000...
Running MergeSort   | Input: duplicates | n = 1000...
Running MergeSort   | Input: duplicates | n = 10000...
Running MergeSort   | Input: duplicates | n = 100000...
Running MergeSort   | Input: duplicates | n = 1000000...
Running QuickSort   | Input: random     | n = 1000...
Running QuickSort   | Input: random     | n = 10000...
Running QuickSort   | Input: random     | n = 100000...
Running QuickSort   | Input: random     | n = 1000000...
Running QuickSort   | Input: sorted     | n = 1000...
Running QuickSort   | Input: sorted     | n = 10000...
Running QuickSort   | Input: sorted     | n = 100000...
Running QuickSort   | Input: sorted     | n = 1000000...
Running QuickSort   | Input: duplicates | n = 1000...
Running QuickSort   | Input: duplicates | n = 10000...
Running QuickSort   | Input: duplicates | n = 100000...
Running QuickSort   | Input: duplicates | n = 1000000...
Running QuickSelect | Input: random     | n = 1000...
Running QuickSelect | Input: random     | n = 10000...
Running QuickSelect | Input: random     | n = 100000...
Running QuickSelect | Input: random     | n = 1000000...
Running QuickSelect | Input: sorted     | n = 1000...
Running QuickSelect | Input: sorted     | n = 10000...
Running QuickSelect | Input: sorted     | n = 100000...
Running QuickSelect | Input: sorted     | n = 1000000...
Running QuickSelect | Input: duplicates | n = 1000...
Running QuickSelect | Input: duplicates | n = 10000...
Running QuickSelect | Input: duplicates | n = 100000...
Running QuickSelect | Input: duplicates | n = 1000000...

Saved 36 rows to /home/nursayat/IdeaProjects/DAA - Assignment - 1/results.csv
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  7.350 s
[INFO] Finished at: 2026-09-16T16:16:35+05:00
[INFO] ------------------------------------------------------------------------
➜  DAA - Assignment - 1 git:(feature/metrics) ✗