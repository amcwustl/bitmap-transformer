# bitmap-transformer

This program supports making a bitmap image grayscale, flipping it vertically,
and producing a negative of the input image.

## grayscale

To make the image grayscale, the program iterates over the pixels and adds up the rgb
values and divides by 3 to get a shade of gray.  The gray color is then input as the new
red green and blue values respectively in the mutated images pixel at the same location.
This is then returned to the output path specified by the user.

To run this from your command line, run
`./gradlew run --args 'PathToInputFile outputName.bmp grayscale'
`
For example: `./gradlew run --args 'src/main/resources/baldy-8bit.bmp output.bmp grayscale'
`
## flip

This flips the image vertically by iterating over half of the height of the image and
reassigning the rgb values with their opposing location on the other side of the image.

To run this from your command line, run
`./gradlew run --args 'PathToInputFile outputName.bmp flip'
`
For example: `./gradlew run --args 'src/main/resources/baldy-8bit.bmp output.bmp flip'
`

## negative

To make the image a negative, the program iterates over the pixels and subtracts
the red blue and green values from 255 respectively to create the inverse and then returns
the mutated image to the user.

To run this from your command line, run
`./gradlew run --args 'PathToInputFile outputName.bmp negative'
`
For example: `./gradlew run --args 'src/main/resources/baldy-8bit.bmp output.bmp negative'
`