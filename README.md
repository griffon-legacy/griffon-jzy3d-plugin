
3D charts and plots
-------------------

Plugin page: [http://artifacts.griffon-framework.org/plugin/jzy3d](http://artifacts.griffon-framework.org/plugin/jzy3d)


Provides integration with [Jzy3d][1], a java library for scientific 3D plotting.

Usage
-----

This plugin does not add new nodes to builders, however it adds a new Artifact:
`Chart3D`. This artifact may belong to an MVC group, thus sharing the same
context variables as the group, or it can stand on its own. Once you have created
a Chart3D class you can configure it on a group as follows:

__griffon-app/conf/Application.groovy__

        mvcGroups {
            // MVC Group for "sample"
            'sample' {
                model      = 'sample.SampleModel'
                chart3d    = 'sample.SampleChart3D'
                view       = 'sample.SampleView'
                controller = 'sample.SampleController'
            }
        }

It is a good idea to place the `chart3d` member before the View, this way the
chart can be referenced from the View and be displayed correctly, which can be
done in this way:

        package sample

        application(title: 'Sample',
                size: [600,600],
                locationByPlatform:true,
                iconImage: imageIcon('/griffon-icon-48x48.png').image,
                iconImages: [imageIcon('/griffon-icon-48x48.png').image,
                imageIcon('/griffon-icon-32x32.png').image,
                imageIcon('/griffon-icon-16x16.png').image]) {
            widget(chart3d.chart.canvas)
        }

### Scripts

 * **create-chart3d** - creates a new Chart3D class that can participate in an
   MVC group if configured accordingly

[1]: http://www.jzy3d.org/

