$ErrorActionPreference = 'Stop'
Set-Location -LiteralPath $PSScriptRoot

if ([string]::IsNullOrWhiteSpace($env:MONGODB_URI)) {
    Write-Host 'Pega la URI de MongoDB. El valor no se mostrara ni se guardara en archivos.'
    $conexionSegura = Read-Host 'URI de MongoDB' -AsSecureString
    $punteroConexion = [Runtime.InteropServices.Marshal]::SecureStringToBSTR($conexionSegura)
    try {
        $env:MONGODB_URI = [Runtime.InteropServices.Marshal]::PtrToStringBSTR($punteroConexion)
    } finally {
        [Runtime.InteropServices.Marshal]::ZeroFreeBSTR($punteroConexion)
        $conexionSegura.Dispose()
    }
}

if ($env:MONGODB_URI -notmatch '^mongodb(\+srv)?://\S+$') {
    throw 'La URI debe comenzar con mongodb:// o mongodb+srv:// y no contener espacios.'
}

& "$PSScriptRoot\mvnw.cmd" spring-boot:run
if ($LASTEXITCODE -ne 0) {
    throw 'Spring no pudo iniciar. Revisa la causa que aparece antes de BUILD FAILURE.'
}
