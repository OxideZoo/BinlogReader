package cloud.ynyg.binlogreader.ui.theme

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

// 颜色常量（Light）- 淡绿色清新
object LightPalette {
    // 清新绿色主色
    val primary = Color(0xFF22C55E)          // 亮绿
    val onPrimary = Color(0xFFFFFFFF)
    val primaryContainer = Color(0xFFD1FADF) // very light mint/green
    val onPrimaryContainer = Color(0xFF05321B)

    // 次级为去饱和的绿灰，适合辅助元素
    val secondary = Color(0xFF5D7A69)
    val onSecondary = Color(0xFFFFFFFF)
    val secondaryContainer = Color(0xFFDDEBDD)
    val onSecondaryContainer = Color(0xFF122016)

    // 三级采用薄荷青，适配数据/标签
    val tertiary = Color(0xFF14B8A6)
    val onTertiary = Color(0xFFFFFFFF)
    val tertiaryContainer = Color(0xFFCFF5F1)
    val onTertiaryContainer = Color(0xFF003732)

    // 错误保持 M3 常规
    val error = Color(0xFFBA1A1A)
    val onError = Color(0xFFFFFFFF)
    val errorContainer = Color(0xFFFFDAD6)
    val onErrorContainer = Color(0xFF410002)

    // 背景和表面带一点点绿白调
    val background = Color(0xFFF8FEFA)
    val onBackground = Color(0xFF1A1C1E)

    val surface = Color(0xFFF8FEFA)
    val onSurface = Color(0xFF1A1C1E)
    val surfaceVariant = Color(0xFFE1ECE5)   // 绿灰的变体表面
    val onSurfaceVariant = Color(0xFF444A46)

    val outline = Color(0xFF75877E)
    val outlineVariant = Color(0xFFC6D5CD)
    val scrim = Color(0x66000000)
}

// 颜色常量（Dark）- 深蓝色
object DarkPalette {
    // 深蓝主题下，主色用偏亮的蓝以保证对比度
    val primary = Color(0xFF84A9FF)
    val onPrimary = Color(0xFF002B64)
    val primaryContainer = Color(0xFF0F2A57) // 深蓝容器
    val onPrimaryContainer = Color(0xFFD6E3FF)

    // 次级为蓝灰体系
    val secondary = Color(0xFFB3C7E0)
    val onSecondary = Color(0xFF1D2C3B)
    val secondaryContainer = Color(0xFF31465A)
    val onSecondaryContainer = Color(0xFFD7E3F8)

    // 三级用青蓝作为点缀
    val tertiary = Color(0xFF7DD3FC)
    val onTertiary = Color(0xFF003546)
    val tertiaryContainer = Color(0xFF005275)
    val onTertiaryContainer = Color(0xFFC6EEFF)

    val error = Color(0xFFFFB4AB)
    val onError = Color(0xFF690005)
    val errorContainer = Color(0xFF93000A)
    val onErrorContainer = Color(0xFFFFDAD6)

    // 深蓝背景/表面
    val background = Color(0xFF0B1220)
    val onBackground = Color(0xFFDCE3EE)

    val surface = Color(0xFF0B1220)
    val onSurface = Color(0xFFDCE3EE)
    val surfaceVariant = Color(0xFF3A4557)
    val onSurfaceVariant = Color(0xFFC6D0E0)

    val outline = Color(0xFF8993A1)
    val outlineVariant = Color(0xFF3A4557)
    val scrim = Color(0x99000000)
}

val LightColors = lightColorScheme(
    primary = LightPalette.primary,
    onPrimary = LightPalette.onPrimary,
    primaryContainer = LightPalette.primaryContainer,
    onPrimaryContainer = LightPalette.onPrimaryContainer,

    secondary = LightPalette.secondary,
    onSecondary = LightPalette.onSecondary,
    secondaryContainer = LightPalette.secondaryContainer,
    onSecondaryContainer = LightPalette.onSecondaryContainer,

    tertiary = LightPalette.tertiary,
    onTertiary = LightPalette.onTertiary,
    tertiaryContainer = LightPalette.tertiaryContainer,
    onTertiaryContainer = LightPalette.onTertiaryContainer,

    error = LightPalette.error,
    onError = LightPalette.onError,
    errorContainer = LightPalette.errorContainer,
    onErrorContainer = LightPalette.onErrorContainer,

    background = LightPalette.background,
    onBackground = LightPalette.onBackground,

    surface = LightPalette.surface,
    onSurface = LightPalette.onSurface,
    surfaceVariant = LightPalette.surfaceVariant,
    onSurfaceVariant = LightPalette.onSurfaceVariant,

    outline = LightPalette.outline,
    outlineVariant = LightPalette.outlineVariant,
    scrim = LightPalette.scrim,
)

val DarkColors = darkColorScheme(
    primary = DarkPalette.primary,
    onPrimary = DarkPalette.onPrimary,
    primaryContainer = DarkPalette.primaryContainer,
    onPrimaryContainer = DarkPalette.onPrimaryContainer,

    secondary = DarkPalette.secondary,
    onSecondary = DarkPalette.onSecondary,
    secondaryContainer = DarkPalette.secondaryContainer,
    onSecondaryContainer = DarkPalette.onSecondaryContainer,

    tertiary = DarkPalette.tertiary,
    onTertiary = DarkPalette.onTertiary,
    tertiaryContainer = DarkPalette.tertiaryContainer,
    onTertiaryContainer = DarkPalette.onTertiaryContainer,

    error = DarkPalette.error,
    onError = DarkPalette.onError,
    errorContainer = DarkPalette.errorContainer,
    onErrorContainer = DarkPalette.onErrorContainer,

    background = DarkPalette.background,
    onBackground = DarkPalette.onBackground,

    surface = DarkPalette.surface,
    onSurface = DarkPalette.onSurface,
    surfaceVariant = DarkPalette.surfaceVariant,
    onSurfaceVariant = DarkPalette.onSurfaceVariant,

    outline = DarkPalette.outline,
    outlineVariant = DarkPalette.outlineVariant,
    scrim = DarkPalette.scrim,
)
