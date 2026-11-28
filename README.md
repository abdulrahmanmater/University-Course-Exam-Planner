# University-Course-Exam-Planner

ELE331 · Algorithms and Data Structures · Team Project 2 — offline Java + JavaFX app.

## Architecture

Layers call **only the layer below them**:

```
app (Main, ScreenRouter)
  -> ui (7 JavaFX screens)
    -> services (7 features, in-memory state)
      -> algorithms (11 static procedures)
        -> structures (13 structures, from scratch)
          -> model (9 plain field holders)
            -> data (DataLoader + 8 loaders; the only JSON-importing package)
```

Helpers: `utils` (DateTimeUtil, TimeRange, AppError, ErrorHandler, FxUtil).
No `java.util` collections in `structures` or above. The JSON library is imported in `data` only.

## Repository tree

```
├── pom.xml                      Maven build: JavaFX + one JSON library
├── README.md                    this file
├── data/                        eight read-only JSON files
│   ├── courses.json · students.json · enrollments.json      (M2)
│   ├── exams.json · exam_slots.json · rooms.json            (M1)
│   └── buildings.json · roads.json                          (M3)
├── docs/                        slides, complexity tables, doubling-ratio results
└── src/
    ├── main/java/eg/edu/benha/ele331/
    │   ├── app/         Main, ScreenRouter
    │   ├── ui/          7 screens
    │   ├── services/    7 services
    │   ├── algorithms/  sorts, traversals, shortest path, MST
    │   ├── structures/  13 structures
    │   ├── model/       9 plain data classes
    │   ├── data/        DataLoader + 8 loaders + JsonError
    │   └── utils/       date/time, error type, FX helpers
    └── test/java/eg/edu/benha/ele331/
        ├── structures/  13 test skeletons
        └── algorithms/  11 test skeletons
```

## How to run

```bash
mvn compile          # compile the skeletons
mvn test             # run the (currently empty) test skeletons
mvn javafx:run       # start the JavaFX app once Main is implemented
```

Every file is an **empty skeleton**: class declaration, method signatures and a TODO.
Methods throw `UnsupportedOperationException` so unfinished code fails loudly.
`UniversityPlanner/` is the earlier sketch kept for reference; the official layout is `src/`.

## Ownership

| Owner | Area | Files |
| --- | --- | --- |
| M1 · Exams & Performance | exams, performance, README | `ExamsView`, `PerformanceAnalysisView`, `ExamSchedulingService`, `ExamConflictService`, `PerformanceAnalysisService`, `InsertionSort`, `MergeSort`, `HeapSort`, `DoublingRatio`, `Exam`, `ExamSlot`, `ExamAssignment`, `Room`, `ExamsLoader`, `ExamSlotsLoader`, `RoomsLoader`, `DateTimeUtil`, `TimeRange` |
| M2 · Courses & Prerequisites | courses, study plan, graph | `CoursesView`, `StudyPlannerView`, `PrerequisiteAnalyzerView`, `CourseService`, `StudyPlannerService`, `PrerequisiteService`, `DFS`, `CycleDetection`, `TopologicalSort`, `DirectedGraph`, `Course`, `Student`, `Enrollment`, `CoursesLoader`, `StudentsLoader`, `EnrollmentsLoader` |
| M3 · Campus & App shell | boot, navigation, campus | `Main`, `ScreenRouter`, `Dashboard`, `CampusNavigationView`, `CampusNavigationService`, `BFS`, `ConnectedComponents`, `Dijkstra`, `Kruskal`, `Graph`, `Edge`, `UndirectedWeightedGraph`, `UnionFind`, `IndexMinPQ`, `LLRB`, `Building`, `Road`, `DataLoader`, `JsonError`, `BuildingsLoader`, `RoadsLoader`, `AppError`, `ErrorHandler`, `FxUtil` |

Shared by all: the remaining structures (`DynamicArray`, `Stack`, `HashTable`, `BST`, `Queue`, `MinHeap`), `utils` basics and every test skeleton.

## Frozen signatures

Structure interfaces, model fields and the `DataLoader.loadAll(String)` signature must be agreed before Nov 29 so all three members can work in parallel.
M2 owns `DFS`; M3 reuses it for undirected traversal — its signature above is the shared one.
