@echo off
REM Script para gerar item models a partir de MechanismsIds.txt

setlocal enabledelayedexpansion

REM Caminho da pasta onde os arquivos serão criados
set OUTPUT_DIR=item

REM Caminho do arquivo de IDs
set IDS_FILE=%OUTPUT_DIR%\zIncompleteMechanism.txt

echo === Gerando item models em %OUTPUT_DIR% ===

for /f "usebackq tokens=* delims=" %%A in ("%IDS_FILE%") do (
    set ID=%%A
    echo {> "%OUTPUT_DIR%\!ID!.json"
    echo   "parent": "minecraft:item/generated",>> "%OUTPUT_DIR%\!ID!.json"
    echo   "textures": {>> "%OUTPUT_DIR%\!ID!.json"
    echo     "layer0": "createmechanisms:item/incompletemechanism/!ID!" >> "%OUTPUT_DIR%\!ID!.json"
    echo   }>> "%OUTPUT_DIR%\!ID!.json"
    echo }>> "%OUTPUT_DIR%\!ID!.json"
    echo Criado: !ID!.json
)

echo === Concluído! ===
pause
