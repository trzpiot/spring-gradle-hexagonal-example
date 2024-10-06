{
  mkShell,
  temurin-bin-21,
}:

mkShell {
  nativeBuildInputs = [
    temurin-bin-21
  ];
}
